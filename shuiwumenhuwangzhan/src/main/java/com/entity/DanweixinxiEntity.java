package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 单位信息
 *
 * @author 
 * @email
 */
@TableName("danweixinxi")
public class DanweixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DanweixinxiEntity() {

	}

	public DanweixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Danweixinxi{" +
            "id=" + id +
            ", danweixinxiName=" + danweixinxiName +
            ", danweixinxiTypes=" + danweixinxiTypes +
            ", danweixinxiPhoto=" + danweixinxiPhoto +
            ", danweixinxiAddress=" + danweixinxiAddress +
            ", danweixinxiNumber=" + danweixinxiNumber +
            ", danweixinxiContent=" + danweixinxiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
