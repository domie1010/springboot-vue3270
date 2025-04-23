package com.entity.view;

import com.entity.DanweixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 单位信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("danweixinxi")
public class DanweixinxiView extends DanweixinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 单位类型的值
		*/
		private String danweixinxiValue;



	public DanweixinxiView() {

	}

	public DanweixinxiView(DanweixinxiEntity danweixinxiEntity) {
		try {
			BeanUtils.copyProperties(this, danweixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 单位类型的值
			*/
			public String getDanweixinxiValue() {
				return danweixinxiValue;
			}
			/**
			* 设置： 单位类型的值
			*/
			public void setDanweixinxiValue(String danweixinxiValue) {
				this.danweixinxiValue = danweixinxiValue;
			}



















}
