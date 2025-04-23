package com.entity.vo;

import com.entity.ZhengcejieduEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 政策解读
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhengcejiedu")
public class ZhengcejieduVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
