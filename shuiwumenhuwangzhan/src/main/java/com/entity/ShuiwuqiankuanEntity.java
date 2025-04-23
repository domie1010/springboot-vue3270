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
 * 税务欠款
 *
 * @author 
 * @email
 */
@TableName("shuiwuqiankuan")
public class ShuiwuqiankuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShuiwuqiankuanEntity() {

	}

	public ShuiwuqiankuanEntity(T t) {
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
     * 税务欠款编号
     */
    @TableField(value = "shuiwuqiankuan_uuid_number")

    private String shuiwuqiankuanUuidNumber;


    /**
     * 税务欠款名称
     */
    @TableField(value = "shuiwuqiankuan_name")

    private String shuiwuqiankuanName;


    /**
     * 税务欠款类型
     */
    @TableField(value = "shuiwuqiankuan_types")

    private Integer shuiwuqiankuanTypes;


    /**
     * 欠款缘由
     */
    @TableField(value = "shuiwuqiankuan_text")

    private String shuiwuqiankuanText;


    /**
     * 欠款金额
     */
    @TableField(value = "shuiwuqiankuan_new_money")

    private Double shuiwuqiankuanNewMoney;


    /**
     * 通知时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 是否缴费
     */
    @TableField(value = "jiaofei_types")

    private Integer jiaofeiTypes;


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
	 * 设置：税务欠款编号
	 */
    public String getShuiwuqiankuanUuidNumber() {
        return shuiwuqiankuanUuidNumber;
    }
    /**
	 * 获取：税务欠款编号
	 */

    public void setShuiwuqiankuanUuidNumber(String shuiwuqiankuanUuidNumber) {
        this.shuiwuqiankuanUuidNumber = shuiwuqiankuanUuidNumber;
    }
    /**
	 * 设置：税务欠款名称
	 */
    public String getShuiwuqiankuanName() {
        return shuiwuqiankuanName;
    }
    /**
	 * 获取：税务欠款名称
	 */

    public void setShuiwuqiankuanName(String shuiwuqiankuanName) {
        this.shuiwuqiankuanName = shuiwuqiankuanName;
    }
    /**
	 * 设置：税务欠款类型
	 */
    public Integer getShuiwuqiankuanTypes() {
        return shuiwuqiankuanTypes;
    }
    /**
	 * 获取：税务欠款类型
	 */

    public void setShuiwuqiankuanTypes(Integer shuiwuqiankuanTypes) {
        this.shuiwuqiankuanTypes = shuiwuqiankuanTypes;
    }
    /**
	 * 设置：欠款缘由
	 */
    public String getShuiwuqiankuanText() {
        return shuiwuqiankuanText;
    }
    /**
	 * 获取：欠款缘由
	 */

    public void setShuiwuqiankuanText(String shuiwuqiankuanText) {
        this.shuiwuqiankuanText = shuiwuqiankuanText;
    }
    /**
	 * 设置：欠款金额
	 */
    public Double getShuiwuqiankuanNewMoney() {
        return shuiwuqiankuanNewMoney;
    }
    /**
	 * 获取：欠款金额
	 */

    public void setShuiwuqiankuanNewMoney(Double shuiwuqiankuanNewMoney) {
        this.shuiwuqiankuanNewMoney = shuiwuqiankuanNewMoney;
    }
    /**
	 * 设置：通知时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：通知时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：是否缴费
	 */
    public Integer getJiaofeiTypes() {
        return jiaofeiTypes;
    }
    /**
	 * 获取：是否缴费
	 */

    public void setJiaofeiTypes(Integer jiaofeiTypes) {
        this.jiaofeiTypes = jiaofeiTypes;
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
        return "Shuiwuqiankuan{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", shuiwuqiankuanUuidNumber=" + shuiwuqiankuanUuidNumber +
            ", shuiwuqiankuanName=" + shuiwuqiankuanName +
            ", shuiwuqiankuanTypes=" + shuiwuqiankuanTypes +
            ", shuiwuqiankuanText=" + shuiwuqiankuanText +
            ", shuiwuqiankuanNewMoney=" + shuiwuqiankuanNewMoney +
            ", insertTime=" + insertTime +
            ", jiaofeiTypes=" + jiaofeiTypes +
            ", createTime=" + createTime +
        "}";
    }
}
