package com.entity.view;

import com.entity.ZhegncewenjianCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 政策文件收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhegncewenjian_collection")
public class ZhegncewenjianCollectionView extends ZhegncewenjianCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String zhegncewenjianCollectionValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

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

	public ZhegncewenjianCollectionView() {

	}

	public ZhegncewenjianCollectionView(ZhegncewenjianCollectionEntity zhegncewenjianCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, zhegncewenjianCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getZhegncewenjianCollectionValue() {
				return zhegncewenjianCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setZhegncewenjianCollectionValue(String zhegncewenjianCollectionValue) {
				this.zhegncewenjianCollectionValue = zhegncewenjianCollectionValue;
			}






































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
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
