package com.entity.view;

import com.entity.ZhengcejieduEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 政策解读
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhengcejiedu")
public class ZhengcejieduView extends ZhengcejieduEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 zhegncewenjian
			/**
			* 政策文件名称
			*/
			private String zhegncewenjianName;
			/**
			* 政策文件编号
			*/
			private String zhegncewenjianUuidNumber;
			/**
			* 政策文件照片
			*/
			private String zhegncewenjianPhoto;
			/**
			* 文件
			*/
			private String zhegncewenjianFile;
			/**
			* 政策文件类型
			*/
			private Integer zhegncewenjianTypes;
				/**
				* 政策文件类型的值
				*/
				private String zhegncewenjianValue;
			/**
			* 政策文件热度
			*/
			private Integer zhegncewenjianClicknum;
			/**
			* 政策文件内容
			*/
			private String zhegncewenjianContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer zhegncewenjianDelete;
			/**
			* 发布时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date fabuTime;
			/**
			* 执行时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date zhixingTime;

	public ZhengcejieduView() {

	}

	public ZhengcejieduView(ZhengcejieduEntity zhengcejieduEntity) {
		try {
			BeanUtils.copyProperties(this, zhengcejieduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set zhegncewenjian

					/**
					* 获取： 政策文件名称
					*/
					public String getZhegncewenjianName() {
						return zhegncewenjianName;
					}
					/**
					* 设置： 政策文件名称
					*/
					public void setZhegncewenjianName(String zhegncewenjianName) {
						this.zhegncewenjianName = zhegncewenjianName;
					}

					/**
					* 获取： 政策文件编号
					*/
					public String getZhegncewenjianUuidNumber() {
						return zhegncewenjianUuidNumber;
					}
					/**
					* 设置： 政策文件编号
					*/
					public void setZhegncewenjianUuidNumber(String zhegncewenjianUuidNumber) {
						this.zhegncewenjianUuidNumber = zhegncewenjianUuidNumber;
					}

					/**
					* 获取： 政策文件照片
					*/
					public String getZhegncewenjianPhoto() {
						return zhegncewenjianPhoto;
					}
					/**
					* 设置： 政策文件照片
					*/
					public void setZhegncewenjianPhoto(String zhegncewenjianPhoto) {
						this.zhegncewenjianPhoto = zhegncewenjianPhoto;
					}

					/**
					* 获取： 文件
					*/
					public String getZhegncewenjianFile() {
						return zhegncewenjianFile;
					}
					/**
					* 设置： 文件
					*/
					public void setZhegncewenjianFile(String zhegncewenjianFile) {
						this.zhegncewenjianFile = zhegncewenjianFile;
					}

					/**
					* 获取： 政策文件类型
					*/
					public Integer getZhegncewenjianTypes() {
						return zhegncewenjianTypes;
					}
					/**
					* 设置： 政策文件类型
					*/
					public void setZhegncewenjianTypes(Integer zhegncewenjianTypes) {
						this.zhegncewenjianTypes = zhegncewenjianTypes;
					}


						/**
						* 获取： 政策文件类型的值
						*/
						public String getZhegncewenjianValue() {
							return zhegncewenjianValue;
						}
						/**
						* 设置： 政策文件类型的值
						*/
						public void setZhegncewenjianValue(String zhegncewenjianValue) {
							this.zhegncewenjianValue = zhegncewenjianValue;
						}

					/**
					* 获取： 政策文件热度
					*/
					public Integer getZhegncewenjianClicknum() {
						return zhegncewenjianClicknum;
					}
					/**
					* 设置： 政策文件热度
					*/
					public void setZhegncewenjianClicknum(Integer zhegncewenjianClicknum) {
						this.zhegncewenjianClicknum = zhegncewenjianClicknum;
					}

					/**
					* 获取： 政策文件内容
					*/
					public String getZhegncewenjianContent() {
						return zhegncewenjianContent;
					}
					/**
					* 设置： 政策文件内容
					*/
					public void setZhegncewenjianContent(String zhegncewenjianContent) {
						this.zhegncewenjianContent = zhegncewenjianContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getZhegncewenjianDelete() {
						return zhegncewenjianDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setZhegncewenjianDelete(Integer zhegncewenjianDelete) {
						this.zhegncewenjianDelete = zhegncewenjianDelete;
					}

					/**
					* 获取： 发布时间
					*/
					public Date getFabuTime() {
						return fabuTime;
					}
					/**
					* 设置： 发布时间
					*/
					public void setFabuTime(Date fabuTime) {
						this.fabuTime = fabuTime;
					}

					/**
					* 获取： 执行时间
					*/
					public Date getZhixingTime() {
						return zhixingTime;
					}
					/**
					* 设置： 执行时间
					*/
					public void setZhixingTime(Date zhixingTime) {
						this.zhixingTime = zhixingTime;
					}








}
