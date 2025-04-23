package com.entity.view;

import com.entity.ZhengcejieduCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 政策解读收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhengcejiedu_collection")
public class ZhengcejieduCollectionView extends ZhengcejieduCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String zhengcejieduCollectionValue;



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

		//级联表 zhengcejiedu
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

	public ZhengcejieduCollectionView() {

	}

	public ZhengcejieduCollectionView(ZhengcejieduCollectionEntity zhengcejieduCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, zhengcejieduCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getZhengcejieduCollectionValue() {
				return zhengcejieduCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setZhengcejieduCollectionValue(String zhengcejieduCollectionValue) {
				this.zhengcejieduCollectionValue = zhengcejieduCollectionValue;
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








				//级联表的get和set zhengcejiedu


					/**
					* 获取： 政策解读名称
					*/
					public String getZhengcejieduName() {
						return zhengcejieduName;
					}
					/**
					* 设置： 政策解读名称
					*/
					public void setZhengcejieduName(String zhengcejieduName) {
						this.zhengcejieduName = zhengcejieduName;
					}

					/**
					* 获取： 政策解读照片
					*/
					public String getZhengcejieduPhoto() {
						return zhengcejieduPhoto;
					}
					/**
					* 设置： 政策解读照片
					*/
					public void setZhengcejieduPhoto(String zhengcejieduPhoto) {
						this.zhengcejieduPhoto = zhengcejieduPhoto;
					}

					/**
					* 获取： 政策解读内容
					*/
					public String getZhengcejieduContent() {
						return zhengcejieduContent;
					}
					/**
					* 设置： 政策解读内容
					*/
					public void setZhengcejieduContent(String zhengcejieduContent) {
						this.zhengcejieduContent = zhengcejieduContent;
					}







}
