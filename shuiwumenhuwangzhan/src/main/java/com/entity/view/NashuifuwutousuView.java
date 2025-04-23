package com.entity.view;

import com.entity.NashuifuwutousuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 纳税服务投诉
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("nashuifuwutousu")
public class NashuifuwutousuView extends NashuifuwutousuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 纳税服务投诉类型的值
		*/
		private String nashuifuwutousuValue;
		/**
		* 状态的值
		*/
		private String nashuifuwutousuChuliValue;



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

	public NashuifuwutousuView() {

	}

	public NashuifuwutousuView(NashuifuwutousuEntity nashuifuwutousuEntity) {
		try {
			BeanUtils.copyProperties(this, nashuifuwutousuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 纳税服务投诉类型的值
			*/
			public String getNashuifuwutousuValue() {
				return nashuifuwutousuValue;
			}
			/**
			* 设置： 纳税服务投诉类型的值
			*/
			public void setNashuifuwutousuValue(String nashuifuwutousuValue) {
				this.nashuifuwutousuValue = nashuifuwutousuValue;
			}
			/**
			* 获取： 状态的值
			*/
			public String getNashuifuwutousuChuliValue() {
				return nashuifuwutousuChuliValue;
			}
			/**
			* 设置： 状态的值
			*/
			public void setNashuifuwutousuChuliValue(String nashuifuwutousuChuliValue) {
				this.nashuifuwutousuChuliValue = nashuifuwutousuChuliValue;
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










}
