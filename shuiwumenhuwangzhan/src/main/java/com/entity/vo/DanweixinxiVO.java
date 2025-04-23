package com.entity.vo;

import com.entity.DanweixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 单位信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("danweixinxi")
public class DanweixinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 单位名称
     */

    @TableField(value = "danweixinxi_name")
    private String danweixinxiName;


    /**
     * 单位类型
     */

    @TableField(value = "danweixinxi_types")
    private Integer danweixinxiTypes;


    /**
     * 单位图片
     */

    @TableField(value = "danweixinxi_photo")
    private String danweixinxiPhoto;


    /**
     * 单位位置
     */

    @TableField(value = "danweixinxi_address")
    private String danweixinxiAddress;


    /**
     * 单位人数
     */

    @TableField(value = "danweixinxi_number")
    private Integer danweixinxiNumber;


    /**
     * 单位介绍
     */

    @TableField(value = "danweixinxi_content")
    private String danweixinxiContent;


    /**
     * 单位信息发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：单位名称
	 */
    public String getDanweixinxiName() {
        return danweixinxiName;
    }


    /**
	 * 获取：单位名称
	 */

    public void setDanweixinxiName(String danweixinxiName) {
        this.danweixinxiName = danweixinxiName;
    }
    /**
	 * 设置：单位类型
	 */
    public Integer getDanweixinxiTypes() {
        return danweixinxiTypes;
    }


    /**
	 * 获取：单位类型
	 */

    public void setDanweixinxiTypes(Integer danweixinxiTypes) {
        this.danweixinxiTypes = danweixinxiTypes;
    }
    /**
	 * 设置：单位图片
	 */
    public String getDanweixinxiPhoto() {
        return danweixinxiPhoto;
    }


    /**
	 * 获取：单位图片
	 */

    public void setDanweixinxiPhoto(String danweixinxiPhoto) {
        this.danweixinxiPhoto = danweixinxiPhoto;
    }
    /**
	 * 设置：单位位置
	 */
    public String getDanweixinxiAddress() {
        return danweixinxiAddress;
    }


    /**
	 * 获取：单位位置
	 */

    public void setDanweixinxiAddress(String danweixinxiAddress) {
        this.danweixinxiAddress = danweixinxiAddress;
    }
    /**
	 * 设置：单位人数
	 */
    public Integer getDanweixinxiNumber() {
        return danweixinxiNumber;
    }


    /**
	 * 获取：单位人数
	 */

    public void setDanweixinxiNumber(Integer danweixinxiNumber) {
        this.danweixinxiNumber = danweixinxiNumber;
    }
    /**
	 * 设置：单位介绍
	 */
    public String getDanweixinxiContent() {
        return danweixinxiContent;
    }


    /**
	 * 获取：单位介绍
	 */

    public void setDanweixinxiContent(String danweixinxiContent) {
        this.danweixinxiContent = danweixinxiContent;
    }
    /**
	 * 设置：单位信息发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：单位信息发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
