package com.entity.model;

import com.entity.ShuiwuqiankuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 税务欠款
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShuiwuqiankuanModel implements Serializable {
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
     * 税务欠款编号
     */
    private String shuiwuqiankuanUuidNumber;


    /**
     * 税务欠款名称
     */
    private String shuiwuqiankuanName;


    /**
     * 税务欠款类型
     */
    private Integer shuiwuqiankuanTypes;


    /**
     * 欠款缘由
     */
    private String shuiwuqiankuanText;


    /**
     * 欠款金额
     */
    private Double shuiwuqiankuanNewMoney;


    /**
     * 通知时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 是否缴费
     */
    private Integer jiaofeiTypes;


    /**
     * 创建时间  show3
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
	 * 获取：税务欠款编号
	 */
    public String getShuiwuqiankuanUuidNumber() {
        return shuiwuqiankuanUuidNumber;
    }


    /**
	 * 设置：税务欠款编号
	 */
    public void setShuiwuqiankuanUuidNumber(String shuiwuqiankuanUuidNumber) {
        this.shuiwuqiankuanUuidNumber = shuiwuqiankuanUuidNumber;
    }
    /**
	 * 获取：税务欠款名称
	 */
    public String getShuiwuqiankuanName() {
        return shuiwuqiankuanName;
    }


    /**
	 * 设置：税务欠款名称
	 */
    public void setShuiwuqiankuanName(String shuiwuqiankuanName) {
        this.shuiwuqiankuanName = shuiwuqiankuanName;
    }
    /**
	 * 获取：税务欠款类型
	 */
    public Integer getShuiwuqiankuanTypes() {
        return shuiwuqiankuanTypes;
    }


    /**
	 * 设置：税务欠款类型
	 */
    public void setShuiwuqiankuanTypes(Integer shuiwuqiankuanTypes) {
        this.shuiwuqiankuanTypes = shuiwuqiankuanTypes;
    }
    /**
	 * 获取：欠款缘由
	 */
    public String getShuiwuqiankuanText() {
        return shuiwuqiankuanText;
    }


    /**
	 * 设置：欠款缘由
	 */
    public void setShuiwuqiankuanText(String shuiwuqiankuanText) {
        this.shuiwuqiankuanText = shuiwuqiankuanText;
    }
    /**
	 * 获取：欠款金额
	 */
    public Double getShuiwuqiankuanNewMoney() {
        return shuiwuqiankuanNewMoney;
    }


    /**
	 * 设置：欠款金额
	 */
    public void setShuiwuqiankuanNewMoney(Double shuiwuqiankuanNewMoney) {
        this.shuiwuqiankuanNewMoney = shuiwuqiankuanNewMoney;
    }
    /**
	 * 获取：通知时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：通知时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：是否缴费
	 */
    public Integer getJiaofeiTypes() {
        return jiaofeiTypes;
    }


    /**
	 * 设置：是否缴费
	 */
    public void setJiaofeiTypes(Integer jiaofeiTypes) {
        this.jiaofeiTypes = jiaofeiTypes;
    }
    /**
	 * 获取：创建时间  show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
