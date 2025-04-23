package com.entity.model;

import com.entity.DanweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 单位信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DanweixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 单位名称
     */
    private String danweixinxiName;


    /**
     * 单位类型
     */
    private Integer danweixinxiTypes;


    /**
     * 单位图片
     */
    private String danweixinxiPhoto;


    /**
     * 单位位置
     */
    private String danweixinxiAddress;


    /**
     * 单位人数
     */
    private Integer danweixinxiNumber;


    /**
     * 单位介绍
     */
    private String danweixinxiContent;


    /**
     * 单位信息发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：单位名称
	 */
    public String getDanweixinxiName() {
        return danweixinxiName;
    }


    /**
	 * 设置：单位名称
	 */
    public void setDanweixinxiName(String danweixinxiName) {
        this.danweixinxiName = danweixinxiName;
    }
    /**
	 * 获取：单位类型
	 */
    public Integer getDanweixinxiTypes() {
        return danweixinxiTypes;
    }


    /**
	 * 设置：单位类型
	 */
    public void setDanweixinxiTypes(Integer danweixinxiTypes) {
        this.danweixinxiTypes = danweixinxiTypes;
    }
    /**
	 * 获取：单位图片
	 */
    public String getDanweixinxiPhoto() {
        return danweixinxiPhoto;
    }


    /**
	 * 设置：单位图片
	 */
    public void setDanweixinxiPhoto(String danweixinxiPhoto) {
        this.danweixinxiPhoto = danweixinxiPhoto;
    }
    /**
	 * 获取：单位位置
	 */
    public String getDanweixinxiAddress() {
        return danweixinxiAddress;
    }


    /**
	 * 设置：单位位置
	 */
    public void setDanweixinxiAddress(String danweixinxiAddress) {
        this.danweixinxiAddress = danweixinxiAddress;
    }
    /**
	 * 获取：单位人数
	 */
    public Integer getDanweixinxiNumber() {
        return danweixinxiNumber;
    }


    /**
	 * 设置：单位人数
	 */
    public void setDanweixinxiNumber(Integer danweixinxiNumber) {
        this.danweixinxiNumber = danweixinxiNumber;
    }
    /**
	 * 获取：单位介绍
	 */
    public String getDanweixinxiContent() {
        return danweixinxiContent;
    }


    /**
	 * 设置：单位介绍
	 */
    public void setDanweixinxiContent(String danweixinxiContent) {
        this.danweixinxiContent = danweixinxiContent;
    }
    /**
	 * 获取：单位信息发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：单位信息发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
