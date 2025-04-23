
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
 * 政策文件
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhegncewenjian")
public class ZhegncewenjianController {
    private static final Logger logger = LoggerFactory.getLogger(ZhegncewenjianController.class);

    @Autowired
    private ZhegncewenjianService zhegncewenjianService;


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
        params.put("zhegncewenjianDeleteStart",1);params.put("zhegncewenjianDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = zhegncewenjianService.queryPage(params);

        //字典表数据转换
        List<ZhegncewenjianView> list =(List<ZhegncewenjianView>)page.getList();
        for(ZhegncewenjianView c:list){
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
        ZhegncewenjianEntity zhegncewenjian = zhegncewenjianService.selectById(id);
        if(zhegncewenjian !=null){
            //entity转view
            ZhegncewenjianView view = new ZhegncewenjianView();
            BeanUtils.copyProperties( zhegncewenjian , view );//把实体数据重构到view中

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
    public R save(@RequestBody ZhegncewenjianEntity zhegncewenjian, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhegncewenjian:{}",this.getClass().getName(),zhegncewenjian.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ZhegncewenjianEntity> queryWrapper = new EntityWrapper<ZhegncewenjianEntity>()
            .eq("zhegncewenjian_name", zhegncewenjian.getZhegncewenjianName())
            .eq("zhegncewenjian_uuid_number", zhegncewenjian.getZhegncewenjianUuidNumber())
            .eq("zhegncewenjian_types", zhegncewenjian.getZhegncewenjianTypes())
            .eq("zhegncewenjian_clicknum", zhegncewenjian.getZhegncewenjianClicknum())
            .eq("shangxia_types", zhegncewenjian.getShangxiaTypes())
            .eq("zhegncewenjian_delete", zhegncewenjian.getZhegncewenjianDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhegncewenjianEntity zhegncewenjianEntity = zhegncewenjianService.selectOne(queryWrapper);
        if(zhegncewenjianEntity==null){
            zhegncewenjian.setZhegncewenjianClicknum(1);
            zhegncewenjian.setShangxiaTypes(1);
            zhegncewenjian.setZhegncewenjianDelete(1);
            zhegncewenjian.setCreateTime(new Date());
            zhegncewenjianService.insert(zhegncewenjian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhegncewenjianEntity zhegncewenjian, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zhegncewenjian:{}",this.getClass().getName(),zhegncewenjian.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ZhegncewenjianEntity> queryWrapper = new EntityWrapper<ZhegncewenjianEntity>()
            .notIn("id",zhegncewenjian.getId())
            .andNew()
            .eq("zhegncewenjian_name", zhegncewenjian.getZhegncewenjianName())
            .eq("zhegncewenjian_uuid_number", zhegncewenjian.getZhegncewenjianUuidNumber())
            .eq("zhegncewenjian_types", zhegncewenjian.getZhegncewenjianTypes())
            .eq("zhegncewenjian_clicknum", zhegncewenjian.getZhegncewenjianClicknum())
            .eq("shangxia_types", zhegncewenjian.getShangxiaTypes())
            .eq("zhegncewenjian_delete", zhegncewenjian.getZhegncewenjianDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhegncewenjianEntity zhegncewenjianEntity = zhegncewenjianService.selectOne(queryWrapper);
        if("".equals(zhegncewenjian.getZhegncewenjianPhoto()) || "null".equals(zhegncewenjian.getZhegncewenjianPhoto())){
                zhegncewenjian.setZhegncewenjianPhoto(null);
        }
        if("".equals(zhegncewenjian.getZhegncewenjianFile()) || "null".equals(zhegncewenjian.getZhegncewenjianFile())){
                zhegncewenjian.setZhegncewenjianFile(null);
        }
        if(zhegncewenjianEntity==null){
            zhegncewenjianService.updateById(zhegncewenjian);//根据id更新
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
        ArrayList<ZhegncewenjianEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ZhegncewenjianEntity zhegncewenjianEntity = new ZhegncewenjianEntity();
            zhegncewenjianEntity.setId(id);
            zhegncewenjianEntity.setZhegncewenjianDelete(2);
            list.add(zhegncewenjianEntity);
        }
        if(list != null && list.size() >0){
            zhegncewenjianService.updateBatchById(list);
        }
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
            List<ZhegncewenjianEntity> zhegncewenjianList = new ArrayList<>();//上传的东西
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
                            ZhegncewenjianEntity zhegncewenjianEntity = new ZhegncewenjianEntity();
//                            zhegncewenjianEntity.setZhegncewenjianName(data.get(0));                    //政策文件名称 要改的
//                            zhegncewenjianEntity.setZhegncewenjianUuidNumber(data.get(0));                    //政策文件编号 要改的
//                            zhegncewenjianEntity.setZhegncewenjianPhoto("");//详情和图片
//                            zhegncewenjianEntity.setZhegncewenjianFile(data.get(0));                    //文件 要改的
//                            zhegncewenjianEntity.setZhegncewenjianTypes(Integer.valueOf(data.get(0)));   //政策文件类型 要改的
//                            zhegncewenjianEntity.setZhegncewenjianClicknum(Integer.valueOf(data.get(0)));   //政策文件热度 要改的
//                            zhegncewenjianEntity.setZhegncewenjianContent("");//详情和图片
//                            zhegncewenjianEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            zhegncewenjianEntity.setZhegncewenjianDelete(1);//逻辑删除字段
//                            zhegncewenjianEntity.setFabuTime(sdf.parse(data.get(0)));          //发布时间 要改的
//                            zhegncewenjianEntity.setZhixingTime(sdf.parse(data.get(0)));          //执行时间 要改的
//                            zhegncewenjianEntity.setCreateTime(date);//时间
                            zhegncewenjianList.add(zhegncewenjianEntity);


                            //把要查询是否重复的字段放入map中
                                //政策文件编号
                                if(seachFields.containsKey("zhegncewenjianUuidNumber")){
                                    List<String> zhegncewenjianUuidNumber = seachFields.get("zhegncewenjianUuidNumber");
                                    zhegncewenjianUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> zhegncewenjianUuidNumber = new ArrayList<>();
                                    zhegncewenjianUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("zhegncewenjianUuidNumber",zhegncewenjianUuidNumber);
                                }
                        }

                        //查询是否重复
                         //政策文件编号
                        List<ZhegncewenjianEntity> zhegncewenjianEntities_zhegncewenjianUuidNumber = zhegncewenjianService.selectList(new EntityWrapper<ZhegncewenjianEntity>().in("zhegncewenjian_uuid_number", seachFields.get("zhegncewenjianUuidNumber")).eq("zhegncewenjian_delete", 1));
                        if(zhegncewenjianEntities_zhegncewenjianUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhegncewenjianEntity s:zhegncewenjianEntities_zhegncewenjianUuidNumber){
                                repeatFields.add(s.getZhegncewenjianUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [政策文件编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        zhegncewenjianService.insertBatch(zhegncewenjianList);
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
        PageUtils page = zhegncewenjianService.queryPage(params);

        //字典表数据转换
        List<ZhegncewenjianView> list =(List<ZhegncewenjianView>)page.getList();
        for(ZhegncewenjianView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhegncewenjianEntity zhegncewenjian = zhegncewenjianService.selectById(id);
            if(zhegncewenjian !=null){

                //点击数量加1
                zhegncewenjian.setZhegncewenjianClicknum(zhegncewenjian.getZhegncewenjianClicknum()+1);
                zhegncewenjianService.updateById(zhegncewenjian);

                //entity转view
                ZhegncewenjianView view = new ZhegncewenjianView();
                BeanUtils.copyProperties( zhegncewenjian , view );//把实体数据重构到view中

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
    public R add(@RequestBody ZhegncewenjianEntity zhegncewenjian, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zhegncewenjian:{}",this.getClass().getName(),zhegncewenjian.toString());
        Wrapper<ZhegncewenjianEntity> queryWrapper = new EntityWrapper<ZhegncewenjianEntity>()
            .eq("zhegncewenjian_name", zhegncewenjian.getZhegncewenjianName())
            .eq("zhegncewenjian_uuid_number", zhegncewenjian.getZhegncewenjianUuidNumber())
            .eq("zhegncewenjian_types", zhegncewenjian.getZhegncewenjianTypes())
            .eq("zhegncewenjian_clicknum", zhegncewenjian.getZhegncewenjianClicknum())
            .eq("shangxia_types", zhegncewenjian.getShangxiaTypes())
            .eq("zhegncewenjian_delete", zhegncewenjian.getZhegncewenjianDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhegncewenjianEntity zhegncewenjianEntity = zhegncewenjianService.selectOne(queryWrapper);
        if(zhegncewenjianEntity==null){
            zhegncewenjian.setZhegncewenjianDelete(1);
            zhegncewenjian.setCreateTime(new Date());
        zhegncewenjianService.insert(zhegncewenjian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
