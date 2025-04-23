package com.entity.vo;

import com.entity.ShuiwuqiankuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 税务欠款
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shuiwuqiankuan")
public class ShuiwuqiankuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 是否缴费
     */

    @TableField(value = "jiaofei_types")
    private Integer jiaofeiTypes;


    /**
     * 创建时间  show3
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
	 * 设置：创建时间  show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
