package com.entity.model;

import com.entity.RenshirenmianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 人事任免
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RenshirenmianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 人事任免标题
     */
    private String renshirenmianName;


    /**
     * 人事任免类型
     */
    private Integer renshirenmianTypes;


    /**
     * 人事任免图片
     */
    private String renshirenmianPhoto;


    /**
     * 姓名
     */
    private String renshirenmianXingming;


    /**
     * 原职位
     */
    private String renshirenmianYuanzhiwei;


    /**
     * 现职位
     */
    private String renshirenmianXianzhiwei;


    /**
     * 人事任免详细内容
     */
    private String renshirenmianContent;


    /**
     * 人事任免发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：人事任免标题
	 */
    public String getRenshirenmianName() {
        return renshirenmianName;
    }


    /**
	 * 设置：人事任免标题
	 */
    public void setRenshirenmianName(String renshirenmianName) {
        this.renshirenmianName = renshirenmianName;
    }
    /**
	 * 获取：人事任免类型
	 */
    public Integer getRenshirenmianTypes() {
        return renshirenmianTypes;
    }


    /**
	 * 设置：人事任免类型
	 */
    public void setRenshirenmianTypes(Integer renshirenmianTypes) {
        this.renshirenmianTypes = renshirenmianTypes;
    }
    /**
	 * 获取：人事任免图片
	 */
    public String getRenshirenmianPhoto() {
        return renshirenmianPhoto;
    }


    /**
	 * 设置：人事任免图片
	 */
    public void setRenshirenmianPhoto(String renshirenmianPhoto) {
        this.renshirenmianPhoto = renshirenmianPhoto;
    }
    /**
	 * 获取：姓名
	 */
    public String getRenshirenmianXingming() {
        return renshirenmianXingming;
    }


    /**
	 * 设置：姓名
	 */
    public void setRenshirenmianXingming(String renshirenmianXingming) {
        this.renshirenmianXingming = renshirenmianXingming;
    }
    /**
	 * 获取：原职位
	 */
    public String getRenshirenmianYuanzhiwei() {
        return renshirenmianYuanzhiwei;
    }


    /**
	 * 设置：原职位
	 */
    public void setRenshirenmianYuanzhiwei(String renshirenmianYuanzhiwei) {
        this.renshirenmianYuanzhiwei = renshirenmianYuanzhiwei;
    }
    /**
	 * 获取：现职位
	 */
    public String getRenshirenmianXianzhiwei() {
        return renshirenmianXianzhiwei;
    }


    /**
	 * 设置：现职位
	 */
    public void setRenshirenmianXianzhiwei(String renshirenmianXianzhiwei) {
        this.renshirenmianXianzhiwei = renshirenmianXianzhiwei;
    }
    /**
	 * 获取：人事任免详细内容
	 */
    public String getRenshirenmianContent() {
        return renshirenmianContent;
    }


    /**
	 * 设置：人事任免详细内容
	 */
    public void setRenshirenmianContent(String renshirenmianContent) {
        this.renshirenmianContent = renshirenmianContent;
    }
    /**
	 * 获取：人事任免发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：人事任免发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
