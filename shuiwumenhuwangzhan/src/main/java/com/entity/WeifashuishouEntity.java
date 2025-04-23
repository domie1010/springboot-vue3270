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
 * 违法税收检举
 *
 * @author 
 * @email
 */
@TableName("weifashuishou")
public class WeifashuishouEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WeifashuishouEntity() {

	}

	public WeifashuishouEntity(T t) {
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
     * 违法税收检举名称
     */
    @TableField(value = "weifashuishou_name")

    private String weifashuishouName;


    /**
     * 违法税收检举编号
     */
    @TableField(value = "weifashuishou_uuid_number")

    private String weifashuishouUuidNumber;


    /**
     * 违法税收检举证据文件
     */
    @TableField(value = "weifashuishou_photo")

    private String weifashuishouPhoto;


    /**
     * 违法税收检举类型
     */
    @TableField(value = "weifashuishou_types")

    private Integer weifashuishouTypes;


    /**
     * 违法税收检举内容
     */
    @TableField(value = "weifashuishou_text")

    private String weifashuishouText;


    /**
     * 检举时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 状态
     */
    @TableField(value = "weifashuishou_chuli_types")

    private Integer weifashuishouChuliTypes;


    /**
     * 处理结果
     */
    @TableField(value = "weifashuishou_chuli_text")

    private String weifashuishouChuliText;


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
	 * 设置：违法税收检举名称
	 */
    public String getWeifashuishouName() {
        return weifashuishouName;
    }
    /**
	 * 获取：违法税收检举名称
	 */

    public void setWeifashuishouName(String weifashuishouName) {
        this.weifashuishouName = weifashuishouName;
    }
    /**
	 * 设置：违法税收检举编号
	 */
    public String getWeifashuishouUuidNumber() {
        return weifashuishouUuidNumber;
    }
    /**
	 * 获取：违法税收检举编号
	 */

    public void setWeifashuishouUuidNumber(String weifashuishouUuidNumber) {
        this.weifashuishouUuidNumber = weifashuishouUuidNumber;
    }
    /**
	 * 设置：违法税收检举证据文件
	 */
    public String getWeifashuishouPhoto() {
        return weifashuishouPhoto;
    }
    /**
	 * 获取：违法税收检举证据文件
	 */

    public void setWeifashuishouPhoto(String weifashuishouPhoto) {
        this.weifashuishouPhoto = weifashuishouPhoto;
    }
    /**
	 * 设置：违法税收检举类型
	 */
    public Integer getWeifashuishouTypes() {
        return weifashuishouTypes;
    }
    /**
	 * 获取：违法税收检举类型
	 */

    public void setWeifashuishouTypes(Integer weifashuishouTypes) {
        this.weifashuishouTypes = weifashuishouTypes;
    }
    /**
	 * 设置：违法税收检举内容
	 */
    public String getWeifashuishouText() {
        return weifashuishouText;
    }
    /**
	 * 获取：违法税收检举内容
	 */

    public void setWeifashuishouText(String weifashuishouText) {
        this.weifashuishouText = weifashuishouText;
    }
    /**
	 * 设置：检举时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：检举时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：状态
	 */
    public Integer getWeifashuishouChuliTypes() {
        return weifashuishouChuliTypes;
    }
    /**
	 * 获取：状态
	 */

    public void setWeifashuishouChuliTypes(Integer weifashuishouChuliTypes) {
        this.weifashuishouChuliTypes = weifashuishouChuliTypes;
    }
    /**
	 * 设置：处理结果
	 */
    public String getWeifashuishouChuliText() {
        return weifashuishouChuliText;
    }
    /**
	 * 获取：处理结果
	 */

    public void setWeifashuishouChuliText(String weifashuishouChuliText) {
        this.weifashuishouChuliText = weifashuishouChuliText;
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
        return "Weifashuishou{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", weifashuishouName=" + weifashuishouName +
            ", weifashuishouUuidNumber=" + weifashuishouUuidNumber +
            ", weifashuishouPhoto=" + weifashuishouPhoto +
            ", weifashuishouTypes=" + weifashuishouTypes +
            ", weifashuishouText=" + weifashuishouText +
            ", insertTime=" + insertTime +
            ", weifashuishouChuliTypes=" + weifashuishouChuliTypes +
            ", weifashuishouChuliText=" + weifashuishouChuliText +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
