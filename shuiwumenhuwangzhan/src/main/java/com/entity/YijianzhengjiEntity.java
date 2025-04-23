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
 * 意见征集
 *
 * @author 
 * @email
 */
@TableName("yijianzhengji")
public class YijianzhengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YijianzhengjiEntity() {

	}

	public YijianzhengjiEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 意见征集名称
     */
    @TableField(value = "yijianzhengji_name")

    private String yijianzhengjiName;


    /**
     * 意见征集编号
     */
    @TableField(value = "yijianzhengji_uuid_number")

    private String yijianzhengjiUuidNumber;


    /**
     * 意见征集文件
     */
    @TableField(value = "yijianzhengji_photo")

    private String yijianzhengjiPhoto;


    /**
     * 意见征集类型
     */
    @TableField(value = "yijianzhengji_types")

    private Integer yijianzhengjiTypes;


    /**
     * 意见征集内容
     */
    @TableField(value = "yijianzhengji_text")

    private String yijianzhengjiText;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 状态
     */
    @TableField(value = "yijianzhengji_chuli_types")

    private Integer yijianzhengjiChuliTypes;


    /**
     * 回复结果
     */
    @TableField(value = "yijianzhengji_chuli_text")

    private String yijianzhengjiChuliText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：意见征集名称
	 */
    public String getYijianzhengjiName() {
        return yijianzhengjiName;
    }
    /**
	 * 获取：意见征集名称
	 */

    public void setYijianzhengjiName(String yijianzhengjiName) {
        this.yijianzhengjiName = yijianzhengjiName;
    }
    /**
	 * 设置：意见征集编号
	 */
    public String getYijianzhengjiUuidNumber() {
        return yijianzhengjiUuidNumber;
    }
    /**
	 * 获取：意见征集编号
	 */

    public void setYijianzhengjiUuidNumber(String yijianzhengjiUuidNumber) {
        this.yijianzhengjiUuidNumber = yijianzhengjiUuidNumber;
    }
    /**
	 * 设置：意见征集文件
	 */
    public String getYijianzhengjiPhoto() {
        return yijianzhengjiPhoto;
    }
    /**
	 * 获取：意见征集文件
	 */

    public void setYijianzhengjiPhoto(String yijianzhengjiPhoto) {
        this.yijianzhengjiPhoto = yijianzhengjiPhoto;
    }
    /**
	 * 设置：意见征集类型
	 */
    public Integer getYijianzhengjiTypes() {
        return yijianzhengjiTypes;
    }
    /**
	 * 获取：意见征集类型
	 */

    public void setYijianzhengjiTypes(Integer yijianzhengjiTypes) {
        this.yijianzhengjiTypes = yijianzhengjiTypes;
    }
    /**
	 * 设置：意见征集内容
	 */
    public String getYijianzhengjiText() {
        return yijianzhengjiText;
    }
    /**
	 * 获取：意见征集内容
	 */

    public void setYijianzhengjiText(String yijianzhengjiText) {
        this.yijianzhengjiText = yijianzhengjiText;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：状态
	 */
    public Integer getYijianzhengjiChuliTypes() {
        return yijianzhengjiChuliTypes;
    }
    /**
	 * 获取：状态
	 */

    public void setYijianzhengjiChuliTypes(Integer yijianzhengjiChuliTypes) {
        this.yijianzhengjiChuliTypes = yijianzhengjiChuliTypes;
    }
    /**
	 * 设置：回复结果
	 */
    public String getYijianzhengjiChuliText() {
        return yijianzhengjiChuliText;
    }
    /**
	 * 获取：回复结果
	 */

    public void setYijianzhengjiChuliText(String yijianzhengjiChuliText) {
        this.yijianzhengjiChuliText = yijianzhengjiChuliText;
    }
    /**
	 * 设置：回复时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
	 * 获取：回复时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        return "Yijianzhengji{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", yijianzhengjiName=" + yijianzhengjiName +
            ", yijianzhengjiUuidNumber=" + yijianzhengjiUuidNumber +
            ", yijianzhengjiPhoto=" + yijianzhengjiPhoto +
            ", yijianzhengjiTypes=" + yijianzhengjiTypes +
            ", yijianzhengjiText=" + yijianzhengjiText +
            ", insertTime=" + insertTime +
            ", yijianzhengjiChuliTypes=" + yijianzhengjiChuliTypes +
            ", yijianzhengjiChuliText=" + yijianzhengjiChuliText +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
