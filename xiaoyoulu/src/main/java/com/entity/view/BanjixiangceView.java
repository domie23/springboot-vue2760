package com.entity.view;

import com.entity.BanjixiangceEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 班级相册
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("banjixiangce")
public class BanjixiangceView extends BanjixiangceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 班级相册类型的值
		*/
		private String banjixiangceValue;



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
			* 用户照片
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 地址
			*/
			private String yonghuAddress;
			/**
			* QQ
			*/
			private String yonghuQq;
			/**
			* 微信
			*/
			private String yonghuWeixin;
			/**
			* 年龄
			*/
			private Integer nianling;
			/**
			* 其他信息
			*/
			private String yonghuText;

	public BanjixiangceView() {

	}

	public BanjixiangceView(BanjixiangceEntity banjixiangceEntity) {
		try {
			BeanUtils.copyProperties(this, banjixiangceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 班级相册类型的值
			*/
			public String getBanjixiangceValue() {
				return banjixiangceValue;
			}
			/**
			* 设置： 班级相册类型的值
			*/
			public void setBanjixiangceValue(String banjixiangceValue) {
				this.banjixiangceValue = banjixiangceValue;
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
					* 获取： 用户照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户照片
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
					* 获取： 地址
					*/
					public String getYonghuAddress() {
						return yonghuAddress;
					}
					/**
					* 设置： 地址
					*/
					public void setYonghuAddress(String yonghuAddress) {
						this.yonghuAddress = yonghuAddress;
					}
					/**
					* 获取： QQ
					*/
					public String getYonghuQq() {
						return yonghuQq;
					}
					/**
					* 设置： QQ
					*/
					public void setYonghuQq(String yonghuQq) {
						this.yonghuQq = yonghuQq;
					}
					/**
					* 获取： 微信
					*/
					public String getYonghuWeixin() {
						return yonghuWeixin;
					}
					/**
					* 设置： 微信
					*/
					public void setYonghuWeixin(String yonghuWeixin) {
						this.yonghuWeixin = yonghuWeixin;
					}
					/**
					* 获取： 年龄
					*/
					public Integer getNianling() {
						return nianling;
					}
					/**
					* 设置： 年龄
					*/
					public void setNianling(Integer nianling) {
						this.nianling = nianling;
					}
					/**
					* 获取： 其他信息
					*/
					public String getYonghuText() {
						return yonghuText;
					}
					/**
					* 设置： 其他信息
					*/
					public void setYonghuText(String yonghuText) {
						this.yonghuText = yonghuText;
					}


}
