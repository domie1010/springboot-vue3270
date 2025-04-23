package com.entity.view;

import com.entity.RenshirenmianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 人事任免
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("renshirenmian")
public class RenshirenmianView extends RenshirenmianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 人事任免类型的值
		*/
		private String renshirenmianValue;



	public RenshirenmianView() {

	}

	public RenshirenmianView(RenshirenmianEntity renshirenmianEntity) {
		try {
			BeanUtils.copyProperties(this, renshirenmianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 人事任免类型的值
			*/
			public String getRenshirenmianValue() {
				return renshirenmianValue;
			}
			/**
			* 设置： 人事任免类型的值
			*/
			public void setRenshirenmianValue(String renshirenmianValue) {
				this.renshirenmianValue = renshirenmianValue;
			}



















}
