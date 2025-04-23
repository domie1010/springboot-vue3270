package com.entity.model;

import com.entity.WeifashuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 违法税收检举
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WeifashuishouModel implements Serializable {
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
     * 违法税收检举名称
     */
    private String weifashuishouName;


    /**
     * 违法税收检举编号
     */
    private String weifashuishouUuidNumber;


    /**
     * 违法税收检举证据文件
     */
    private String weifashuishouPhoto;


    /**
     * 违法税收检举类型
     */
    private Integer weifashuishouTypes;


    /**
     * 违法税收检举内容
     */
    private String weifashuishouText;


    /**
     * 检举时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 状态
     */
    private Integer weifashuishouChuliTypes;


    /**
     * 处理结果
     */
    private String weifashuishouChuliText;


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
	 * 获取：违法税收检举名称
	 */
    public String getWeifashuishouName() {
        return weifashuishouName;
    }


    /**
	 * 设置：违法税收检举名称
	 */
    public void setWeifashuishouName(String weifashuishouName) {
        this.weifashuishouName = weifashuishouName;
    }
    /**
	 * 获取：违法税收检举编号
	 */
    public String getWeifashuishouUuidNumber() {
        return weifashuishouUuidNumber;
    }


    /**
	 * 设置：违法税收检举编号
	 */
    public void setWeifashuishouUuidNumber(String weifashuishouUuidNumber) {
        this.weifashuishouUuidNumber = weifashuishouUuidNumber;
    }
    /**
	 * 获取：违法税收检举证据文件
	 */
    public String getWeifashuishouPhoto() {
        return weifashuishouPhoto;
    }


    /**
	 * 设置：违法税收检举证据文件
	 */
    public void setWeifashuishouPhoto(String weifashuishouPhoto) {
        this.weifashuishouPhoto = weifashuishouPhoto;
    }
    /**
	 * 获取：违法税收检举类型
	 */
    public Integer getWeifashuishouTypes() {
        return weifashuishouTypes;
    }


    /**
	 * 设置：违法税收检举类型
	 */
    public void setWeifashuishouTypes(Integer weifashuishouTypes) {
        this.weifashuishouTypes = weifashuishouTypes;
    }
    /**
	 * 获取：违法税收检举内容
	 */
    public String getWeifashuishouText() {
        return weifashuishouText;
    }


    /**
	 * 设置：违法税收检举内容
	 */
    public void setWeifashuishouText(String weifashuishouText) {
        this.weifashuishouText = weifashuishouText;
    }
    /**
	 * 获取：检举时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：检举时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：状态
	 */
    public Integer getWeifashuishouChuliTypes() {
        return weifashuishouChuliTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setWeifashuishouChuliTypes(Integer weifashuishouChuliTypes) {
        this.weifashuishouChuliTypes = weifashuishouChuliTypes;
    }
    /**
	 * 获取：处理结果
	 */
    public String getWeifashuishouChuliText() {
        return weifashuishouChuliText;
    }


    /**
	 * 设置：处理结果
	 */
    public void setWeifashuishouChuliText(String weifashuishouChuliText) {
        this.weifashuishouChuliText = weifashuishouChuliText;
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
