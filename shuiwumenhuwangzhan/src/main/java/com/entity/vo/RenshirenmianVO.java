package com.entity.vo;

import com.entity.RenshirenmianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 人事任免
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("renshirenmian")
public class RenshirenmianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 人事任免标题
     */

    @TableField(value = "renshirenmian_name")
    private String renshirenmianName;


    /**
     * 人事任免类型
     */

    @TableField(value = "renshirenmian_types")
    private Integer renshirenmianTypes;


    /**
     * 人事任免图片
     */

    @TableField(value = "renshirenmian_photo")
    private String renshirenmianPhoto;


    /**
     * 姓名
     */

    @TableField(value = "renshirenmian_xingming")
    private String renshirenmianXingming;


    /**
     * 原职位
     */

    @TableField(value = "renshirenmian_yuanzhiwei")
    private String renshirenmianYuanzhiwei;


    /**
     * 现职位
     */

    @TableField(value = "renshirenmian_xianzhiwei")
    private String renshirenmianXianzhiwei;


    /**
     * 人事任免详细内容
     */

    @TableField(value = "renshirenmian_content")
    private String renshirenmianContent;


    /**
     * 人事任免发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：人事任免标题
	 */
    public String getRenshirenmianName() {
        return renshirenmianName;
    }


    /**
	 * 获取：人事任免标题
	 */

    public void setRenshirenmianName(String renshirenmianName) {
        this.renshirenmianName = renshirenmianName;
    }
    /**
	 * 设置：人事任免类型
	 */
    public Integer getRenshirenmianTypes() {
        return renshirenmianTypes;
    }


    /**
	 * 获取：人事任免类型
	 */

    public void setRenshirenmianTypes(Integer renshirenmianTypes) {
        this.renshirenmianTypes = renshirenmianTypes;
    }
    /**
	 * 设置：人事任免图片
	 */
    public String getRenshirenmianPhoto() {
        return renshirenmianPhoto;
    }


    /**
	 * 获取：人事任免图片
	 */

    public void setRenshirenmianPhoto(String renshirenmianPhoto) {
        this.renshirenmianPhoto = renshirenmianPhoto;
    }
    /**
	 * 设置：姓名
	 */
    public String getRenshirenmianXingming() {
        return renshirenmianXingming;
    }


    /**
	 * 获取：姓名
	 */

    public void setRenshirenmianXingming(String renshirenmianXingming) {
        this.renshirenmianXingming = renshirenmianXingming;
    }
    /**
	 * 设置：原职位
	 */
    public String getRenshirenmianYuanzhiwei() {
        return renshirenmianYuanzhiwei;
    }


    /**
	 * 获取：原职位
	 */

    public void setRenshirenmianYuanzhiwei(String renshirenmianYuanzhiwei) {
        this.renshirenmianYuanzhiwei = renshirenmianYuanzhiwei;
    }
    /**
	 * 设置：现职位
	 */
    public String getRenshirenmianXianzhiwei() {
        return renshirenmianXianzhiwei;
    }


    /**
	 * 获取：现职位
	 */

    public void setRenshirenmianXianzhiwei(String renshirenmianXianzhiwei) {
        this.renshirenmianXianzhiwei = renshirenmianXianzhiwei;
    }
    /**
	 * 设置：人事任免详细内容
	 */
    public String getRenshirenmianContent() {
        return renshirenmianContent;
    }


    /**
	 * 获取：人事任免详细内容
	 */

    public void setRenshirenmianContent(String renshirenmianContent) {
        this.renshirenmianContent = renshirenmianContent;
    }
    /**
	 * 设置：人事任免发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：人事任免发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
