package com.entity.model;

import com.entity.ZhengcejieduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 政策解读
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhengcejieduModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 政策文件
     */
    private Integer zhegncewenjianId;


    /**
     * 政策解读名称
     */
    private String zhengcejieduName;


    /**
     * 政策解读照片
     */
    private String zhengcejieduPhoto;


    /**
     * 政策解读内容
     */
    private String zhengcejieduContent;


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
	 * 获取：政策文件
	 */
    public Integer getZhegncewenjianId() {
        return zhegncewenjianId;
    }


    /**
	 * 设置：政策文件
	 */
    public void setZhegncewenjianId(Integer zhegncewenjianId) {
        this.zhegncewenjianId = zhegncewenjianId;
    }
    /**
	 * 获取：政策解读名称
	 */
    public String getZhengcejieduName() {
        return zhengcejieduName;
    }


    /**
	 * 设置：政策解读名称
	 */
    public void setZhengcejieduName(String zhengcejieduName) {
        this.zhengcejieduName = zhengcejieduName;
    }
    /**
	 * 获取：政策解读照片
	 */
    public String getZhengcejieduPhoto() {
        return zhengcejieduPhoto;
    }


    /**
	 * 设置：政策解读照片
	 */
    public void setZhengcejieduPhoto(String zhengcejieduPhoto) {
        this.zhengcejieduPhoto = zhengcejieduPhoto;
    }
    /**
	 * 获取：政策解读内容
	 */
    public String getZhengcejieduContent() {
        return zhengcejieduContent;
    }


    /**
	 * 设置：政策解读内容
	 */
    public void setZhengcejieduContent(String zhengcejieduContent) {
        this.zhengcejieduContent = zhengcejieduContent;
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
