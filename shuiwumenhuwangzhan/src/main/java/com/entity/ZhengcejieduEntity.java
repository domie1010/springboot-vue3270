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
 * 政策解读
 *
 * @author 
 * @email
 */
@TableName("zhengcejiedu")
public class ZhengcejieduEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhengcejieduEntity() {

	}

	public ZhengcejieduEntity(T t) {
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
     * 政策文件
     */
    @TableField(value = "zhegncewenjian_id")

    private Integer zhegncewenjianId;


    /**
     * 政策解读名称
     */
    @TableField(value = "zhengcejiedu_name")

    private String zhengcejieduName;


    /**
     * 政策解读照片
     */
    @TableField(value = "zhengcejiedu_photo")

    private String zhengcejieduPhoto;


    /**
     * 政策解读内容
     */
    @TableField(value = "zhengcejiedu_content")

    private String zhengcejieduContent;


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
	 * 设置：政策文件
	 */
    public Integer getZhegncewenjianId() {
        return zhegncewenjianId;
    }
    /**
	 * 获取：政策文件
	 */

    public void setZhegncewenjianId(Integer zhegncewenjianId) {
        this.zhegncewenjianId = zhegncewenjianId;
    }
    /**
	 * 设置：政策解读名称
	 */
    public String getZhengcejieduName() {
        return zhengcejieduName;
    }
    /**
	 * 获取：政策解读名称
	 */

    public void setZhengcejieduName(String zhengcejieduName) {
        this.zhengcejieduName = zhengcejieduName;
    }
    /**
	 * 设置：政策解读照片
	 */
    public String getZhengcejieduPhoto() {
        return zhengcejieduPhoto;
    }
    /**
	 * 获取：政策解读照片
	 */

    public void setZhengcejieduPhoto(String zhengcejieduPhoto) {
        this.zhengcejieduPhoto = zhengcejieduPhoto;
    }
    /**
	 * 设置：政策解读内容
	 */
    public String getZhengcejieduContent() {
        return zhengcejieduContent;
    }
    /**
	 * 获取：政策解读内容
	 */

    public void setZhengcejieduContent(String zhengcejieduContent) {
        this.zhengcejieduContent = zhengcejieduContent;
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
        return "Zhengcejiedu{" +
            "id=" + id +
            ", zhegncewenjianId=" + zhegncewenjianId +
            ", zhengcejieduName=" + zhengcejieduName +
            ", zhengcejieduPhoto=" + zhengcejieduPhoto +
            ", zhengcejieduContent=" + zhengcejieduContent +
            ", createTime=" + createTime +
        "}";
    }
}
