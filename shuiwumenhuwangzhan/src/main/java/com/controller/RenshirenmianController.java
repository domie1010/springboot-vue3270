
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 人事任免
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/renshirenmian")
public class RenshirenmianController {
    private static final Logger logger = LoggerFactory.getLogger(RenshirenmianController.class);

    @Autowired
    private RenshirenmianService renshirenmianService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = renshirenmianService.queryPage(params);

        //字典表数据转换
        List<RenshirenmianView> list =(List<RenshirenmianView>)page.getList();
        for(RenshirenmianView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        RenshirenmianEntity renshirenmian = renshirenmianService.selectById(id);
        if(renshirenmian !=null){
            //entity转view
            RenshirenmianView view = new RenshirenmianView();
            BeanUtils.copyProperties( renshirenmian , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody RenshirenmianEntity renshirenmian, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,renshirenmian:{}",this.getClass().getName(),renshirenmian.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<RenshirenmianEntity> queryWrapper = new EntityWrapper<RenshirenmianEntity>()
            .eq("renshirenmian_name", renshirenmian.getRenshirenmianName())
            .eq("renshirenmian_types", renshirenmian.getRenshirenmianTypes())
            .eq("renshirenmian_xingming", renshirenmian.getRenshirenmianXingming())
            .eq("renshirenmian_yuanzhiwei", renshirenmian.getRenshirenmianYuanzhiwei())
            .eq("renshirenmian_xianzhiwei", renshirenmian.getRenshirenmianXianzhiwei())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        RenshirenmianEntity renshirenmianEntity = renshirenmianService.selectOne(queryWrapper);
        if(renshirenmianEntity==null){
            renshirenmian.setInsertTime(new Date());
            renshirenmian.setCreateTime(new Date());
            renshirenmianService.insert(renshirenmian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody RenshirenmianEntity renshirenmian, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,renshirenmian:{}",this.getClass().getName(),renshirenmian.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<RenshirenmianEntity> queryWrapper = new EntityWrapper<RenshirenmianEntity>()
            .notIn("id",renshirenmian.getId())
            .andNew()
            .eq("renshirenmian_name", renshirenmian.getRenshirenmianName())
            .eq("renshirenmian_types", renshirenmian.getRenshirenmianTypes())
            .eq("renshirenmian_xingming", renshirenmian.getRenshirenmianXingming())
            .eq("renshirenmian_yuanzhiwei", renshirenmian.getRenshirenmianYuanzhiwei())
            .eq("renshirenmian_xianzhiwei", renshirenmian.getRenshirenmianXianzhiwei())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        RenshirenmianEntity renshirenmianEntity = renshirenmianService.selectOne(queryWrapper);
        if("".equals(renshirenmian.getRenshirenmianPhoto()) || "null".equals(renshirenmian.getRenshirenmianPhoto())){
                renshirenmian.setRenshirenmianPhoto(null);
        }
        if(renshirenmianEntity==null){
            renshirenmianService.updateById(renshirenmian);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        renshirenmianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<RenshirenmianEntity> renshirenmianList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            RenshirenmianEntity renshirenmianEntity = new RenshirenmianEntity();
//                            renshirenmianEntity.setRenshirenmianName(data.get(0));                    //人事任免标题 要改的
//                            renshirenmianEntity.setRenshirenmianTypes(Integer.valueOf(data.get(0)));   //人事任免类型 要改的
//                            renshirenmianEntity.setRenshirenmianPhoto("");//详情和图片
//                            renshirenmianEntity.setRenshirenmianXingming(data.get(0));                    //姓名 要改的
//                            renshirenmianEntity.setRenshirenmianYuanzhiwei(data.get(0));                    //原职位 要改的
//                            renshirenmianEntity.setRenshirenmianXianzhiwei(data.get(0));                    //现职位 要改的
//                            renshirenmianEntity.setRenshirenmianContent("");//详情和图片
//                            renshirenmianEntity.setInsertTime(date);//时间
//                            renshirenmianEntity.setCreateTime(date);//时间
                            renshirenmianList.add(renshirenmianEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        renshirenmianService.insertBatch(renshirenmianList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = renshirenmianService.queryPage(params);

        //字典表数据转换
        List<RenshirenmianView> list =(List<RenshirenmianView>)page.getList();
        for(RenshirenmianView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        RenshirenmianEntity renshirenmian = renshirenmianService.selectById(id);
            if(renshirenmian !=null){


                //entity转view
                RenshirenmianView view = new RenshirenmianView();
                BeanUtils.copyProperties( renshirenmian , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody RenshirenmianEntity renshirenmian, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,renshirenmian:{}",this.getClass().getName(),renshirenmian.toString());
        Wrapper<RenshirenmianEntity> queryWrapper = new EntityWrapper<RenshirenmianEntity>()
            .eq("renshirenmian_name", renshirenmian.getRenshirenmianName())
            .eq("renshirenmian_types", renshirenmian.getRenshirenmianTypes())
            .eq("renshirenmian_xingming", renshirenmian.getRenshirenmianXingming())
            .eq("renshirenmian_yuanzhiwei", renshirenmian.getRenshirenmianYuanzhiwei())
            .eq("renshirenmian_xianzhiwei", renshirenmian.getRenshirenmianXianzhiwei())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        RenshirenmianEntity renshirenmianEntity = renshirenmianService.selectOne(queryWrapper);
        if(renshirenmianEntity==null){
            renshirenmian.setInsertTime(new Date());
            renshirenmian.setCreateTime(new Date());
        renshirenmianService.insert(renshirenmian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
