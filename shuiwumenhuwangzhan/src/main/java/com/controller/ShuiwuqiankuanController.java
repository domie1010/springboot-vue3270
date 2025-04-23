
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
 * 税务欠款
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shuiwuqiankuan")
public class ShuiwuqiankuanController {
    private static final Logger logger = LoggerFactory.getLogger(ShuiwuqiankuanController.class);

    @Autowired
    private ShuiwuqiankuanService shuiwuqiankuanService;


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
        PageUtils page = shuiwuqiankuanService.queryPage(params);

        //字典表数据转换
        List<ShuiwuqiankuanView> list =(List<ShuiwuqiankuanView>)page.getList();
        for(ShuiwuqiankuanView c:list){
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
        ShuiwuqiankuanEntity shuiwuqiankuan = shuiwuqiankuanService.selectById(id);
        if(shuiwuqiankuan !=null){
            //entity转view
            ShuiwuqiankuanView view = new ShuiwuqiankuanView();
            BeanUtils.copyProperties( shuiwuqiankuan , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(shuiwuqiankuan.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
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
    public R save(@RequestBody ShuiwuqiankuanEntity shuiwuqiankuan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shuiwuqiankuan:{}",this.getClass().getName(),shuiwuqiankuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            shuiwuqiankuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ShuiwuqiankuanEntity> queryWrapper = new EntityWrapper<ShuiwuqiankuanEntity>()
            .eq("yonghu_id", shuiwuqiankuan.getYonghuId())
            .eq("shuiwuqiankuan_uuid_number", shuiwuqiankuan.getShuiwuqiankuanUuidNumber())
            .eq("shuiwuqiankuan_name", shuiwuqiankuan.getShuiwuqiankuanName())
            .eq("shuiwuqiankuan_types", shuiwuqiankuan.getShuiwuqiankuanTypes())
            .eq("shuiwuqiankuan_text", shuiwuqiankuan.getShuiwuqiankuanText())
            .eq("jiaofei_types", shuiwuqiankuan.getJiaofeiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShuiwuqiankuanEntity shuiwuqiankuanEntity = shuiwuqiankuanService.selectOne(queryWrapper);
        if(shuiwuqiankuanEntity==null){
            shuiwuqiankuan.setInsertTime(new Date());
            shuiwuqiankuan.setCreateTime(new Date());
            shuiwuqiankuanService.insert(shuiwuqiankuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShuiwuqiankuanEntity shuiwuqiankuan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shuiwuqiankuan:{}",this.getClass().getName(),shuiwuqiankuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            shuiwuqiankuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ShuiwuqiankuanEntity> queryWrapper = new EntityWrapper<ShuiwuqiankuanEntity>()
            .notIn("id",shuiwuqiankuan.getId())
            .andNew()
            .eq("yonghu_id", shuiwuqiankuan.getYonghuId())
            .eq("shuiwuqiankuan_uuid_number", shuiwuqiankuan.getShuiwuqiankuanUuidNumber())
            .eq("shuiwuqiankuan_name", shuiwuqiankuan.getShuiwuqiankuanName())
            .eq("shuiwuqiankuan_types", shuiwuqiankuan.getShuiwuqiankuanTypes())
            .eq("shuiwuqiankuan_text", shuiwuqiankuan.getShuiwuqiankuanText())
            .eq("jiaofei_types", shuiwuqiankuan.getJiaofeiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShuiwuqiankuanEntity shuiwuqiankuanEntity = shuiwuqiankuanService.selectOne(queryWrapper);
        if(shuiwuqiankuanEntity==null){
            shuiwuqiankuanService.updateById(shuiwuqiankuan);//根据id更新
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
        shuiwuqiankuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 缴费
    */
    @RequestMapping("/jiaofei")
    public R jiaofei(@RequestParam("id") Integer id){
        logger.debug("jiaofei:,,Controller:{},,id:{}",this.getClass().getName(),id.toString());
        ShuiwuqiankuanEntity shuiwuqiankuanEntity = shuiwuqiankuanService.selectById(id);
        if(shuiwuqiankuanEntity==null)
            return R.error("查不到要缴费的税务欠款");
        if(shuiwuqiankuanEntity.getJiaofeiTypes()==2)
            return R.error("已经缴费过了,无法重复缴费");


        YonghuEntity yonghuEntity = yonghuService.selectById(shuiwuqiankuanEntity.getYonghuId());
        if(yonghuEntity==null)
            return R.error("查不到用户");

        double balance = yonghuEntity.getNewMoney() - shuiwuqiankuanEntity.getShuiwuqiankuanNewMoney();
        if(balance<0)
            return R.error("当前账户余额不够缴费,请去个人中心中充值后缴费");

        yonghuEntity.setNewMoney(balance);
        shuiwuqiankuanEntity.setJiaofeiTypes(2);

        yonghuService.updateById(yonghuEntity);
        shuiwuqiankuanService.updateById(shuiwuqiankuanEntity);

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
            List<ShuiwuqiankuanEntity> shuiwuqiankuanList = new ArrayList<>();//上传的东西
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
                            ShuiwuqiankuanEntity shuiwuqiankuanEntity = new ShuiwuqiankuanEntity();
//                            shuiwuqiankuanEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            shuiwuqiankuanEntity.setShuiwuqiankuanUuidNumber(data.get(0));                    //税务欠款编号 要改的
//                            shuiwuqiankuanEntity.setShuiwuqiankuanName(data.get(0));                    //税务欠款名称 要改的
//                            shuiwuqiankuanEntity.setShuiwuqiankuanTypes(Integer.valueOf(data.get(0)));   //税务欠款类型 要改的
//                            shuiwuqiankuanEntity.setShuiwuqiankuanText(data.get(0));                    //欠款缘由 要改的
//                            shuiwuqiankuanEntity.setShuiwuqiankuanNewMoney(data.get(0));                    //欠款金额 要改的
//                            shuiwuqiankuanEntity.setInsertTime(date);//时间
//                            shuiwuqiankuanEntity.setJiaofeiTypes(Integer.valueOf(data.get(0)));   //是否缴费 要改的
//                            shuiwuqiankuanEntity.setCreateTime(date);//时间
                            shuiwuqiankuanList.add(shuiwuqiankuanEntity);


                            //把要查询是否重复的字段放入map中
                                //税务欠款编号
                                if(seachFields.containsKey("shuiwuqiankuanUuidNumber")){
                                    List<String> shuiwuqiankuanUuidNumber = seachFields.get("shuiwuqiankuanUuidNumber");
                                    shuiwuqiankuanUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shuiwuqiankuanUuidNumber = new ArrayList<>();
                                    shuiwuqiankuanUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shuiwuqiankuanUuidNumber",shuiwuqiankuanUuidNumber);
                                }
                        }

                        //查询是否重复
                         //税务欠款编号
                        List<ShuiwuqiankuanEntity> shuiwuqiankuanEntities_shuiwuqiankuanUuidNumber = shuiwuqiankuanService.selectList(new EntityWrapper<ShuiwuqiankuanEntity>().in("shuiwuqiankuan_uuid_number", seachFields.get("shuiwuqiankuanUuidNumber")));
                        if(shuiwuqiankuanEntities_shuiwuqiankuanUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShuiwuqiankuanEntity s:shuiwuqiankuanEntities_shuiwuqiankuanUuidNumber){
                                repeatFields.add(s.getShuiwuqiankuanUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [税务欠款编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shuiwuqiankuanService.insertBatch(shuiwuqiankuanList);
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
        PageUtils page = shuiwuqiankuanService.queryPage(params);

        //字典表数据转换
        List<ShuiwuqiankuanView> list =(List<ShuiwuqiankuanView>)page.getList();
        for(ShuiwuqiankuanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShuiwuqiankuanEntity shuiwuqiankuan = shuiwuqiankuanService.selectById(id);
            if(shuiwuqiankuan !=null){


                //entity转view
                ShuiwuqiankuanView view = new ShuiwuqiankuanView();
                BeanUtils.copyProperties( shuiwuqiankuan , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(shuiwuqiankuan.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
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
    public R add(@RequestBody ShuiwuqiankuanEntity shuiwuqiankuan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shuiwuqiankuan:{}",this.getClass().getName(),shuiwuqiankuan.toString());
        Wrapper<ShuiwuqiankuanEntity> queryWrapper = new EntityWrapper<ShuiwuqiankuanEntity>()
            .eq("yonghu_id", shuiwuqiankuan.getYonghuId())
            .eq("shuiwuqiankuan_uuid_number", shuiwuqiankuan.getShuiwuqiankuanUuidNumber())
            .eq("shuiwuqiankuan_name", shuiwuqiankuan.getShuiwuqiankuanName())
            .eq("shuiwuqiankuan_types", shuiwuqiankuan.getShuiwuqiankuanTypes())
            .eq("shuiwuqiankuan_text", shuiwuqiankuan.getShuiwuqiankuanText())
            .eq("jiaofei_types", shuiwuqiankuan.getJiaofeiTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShuiwuqiankuanEntity shuiwuqiankuanEntity = shuiwuqiankuanService.selectOne(queryWrapper);
        if(shuiwuqiankuanEntity==null){
            shuiwuqiankuan.setInsertTime(new Date());
            shuiwuqiankuan.setCreateTime(new Date());
        shuiwuqiankuanService.insert(shuiwuqiankuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
