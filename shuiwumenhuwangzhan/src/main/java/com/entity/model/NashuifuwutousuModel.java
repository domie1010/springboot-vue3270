package com.entity.model;

import com.entity.NashuifuwutousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 纳税服务投诉
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class NashuifuwutousuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 纳税服务投诉名称
     */
    private String nashuifuwutousuName;


    /**
     * 纳税服务投诉编号
     */
    private String nashuifuwutousuUuidNumber;


    /**
     * 纳税服务投诉证据文件
     */
    private String nashuifuwutousuPhoto;


    /**
     * 纳税服务投诉类型
     */
    private Integer nashuifuwutousuTypes;


    /**
     * 纳税服务投诉内容
     */
    private String nashuifuwutousuText;


    /**
     * 投诉时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 状态
     */
    private Integer nashuifuwutousuChuliTypes;


    /**
     * 处理结果
     */
    private String nashuifuwutousuChuliText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：纳税服务投诉名称
	 */
    public String getNashuifuwutousuName() {
        return nashuifuwutousuName;
    }


    /**
	 * 设置：纳税服务投诉名称
	 */
    public void setNashuifuwutousuName(String nashuifuwutousuName) {
        this.nashuifuwutousuName = nashuifuwutousuName;
    }
    /**
	 * 获取：纳税服务投诉编号
	 */
    public String getNashuifuwutousuUuidNumber() {
        return nashuifuwutousuUuidNumber;
    }


    /**
	 * 设置：纳税服务投诉编号
	 */
    public void setNashuifuwutousuUuidNumber(String nashuifuwutousuUuidNumber) {
        this.nashuifuwutousuUuidNumber = nashuifuwutousuUuidNumber;
    }
    /**
	 * 获取：纳税服务投诉证据文件
	 */
    public String getNashuifuwutousuPhoto() {
        return nashuifuwutousuPhoto;
    }


    /**
	 * 设置：纳税服务投诉证据文件
	 */
    public void setNashuifuwutousuPhoto(String nashuifuwutousuPhoto) {
        this.nashuifuwutousuPhoto = nashuifuwutousuPhoto;
    }
    /**
	 * 获取：纳税服务投诉类型
	 */
    public Integer getNashuifuwutousuTypes() {
        return nashuifuwutousuTypes;
    }


    /**
	 * 设置：纳税服务投诉类型
	 */
    public void setNashuifuwutousuTypes(Integer nashuifuwutousuTypes) {
        this.nashuifuwutousuTypes = nashuifuwutousuTypes;
    }
    /**
	 * 获取：纳税服务投诉内容
	 */
    public String getNashuifuwutousuText() {
        return nashuifuwutousuText;
    }


    /**
	 * 设置：纳税服务投诉内容
	 */
    public void setNashuifuwutousuText(String nashuifuwutousuText) {
        this.nashuifuwutousuText = nashuifuwutousuText;
    }
    /**
	 * 获取：投诉时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：投诉时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：状态
	 */
    public Integer getNashuifuwutousuChuliTypes() {
        return nashuifuwutousuChuliTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setNashuifuwutousuChuliTypes(Integer nashuifuwutousuChuliTypes) {
        this.nashuifuwutousuChuliTypes = nashuifuwutousuChuliTypes;
    }
    /**
	 * 获取：处理结果
	 */
    public String getNashuifuwutousuChuliText() {
        return nashuifuwutousuChuliText;
    }


    /**
	 * 设置：处理结果
	 */
    public void setNashuifuwutousuChuliText(String nashuifuwutousuChuliText) {
        this.nashuifuwutousuChuliText = nashuifuwutousuChuliText;
    }
    /**
	 * 获取：回复时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：回复时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
