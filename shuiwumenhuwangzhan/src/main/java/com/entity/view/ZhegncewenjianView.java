package com.entity.view;

import com.entity.ZhegncewenjianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 政策文件
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhegncewenjian")
public class ZhegncewenjianView extends ZhegncewenjianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 政策文件类型的值
		*/
		private String zhegncewenjianValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ZhegncewenjianView() {

	}

	public ZhegncewenjianView(ZhegncewenjianEntity zhegncewenjianEntity) {
		try {
			BeanUtils.copyProperties(this, zhegncewenjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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



















}
