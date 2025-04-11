package com.entity.view;

import com.entity.BanjixiangceCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 班级相册收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("banjixiangce_collection")
public class BanjixiangceCollectionView extends BanjixiangceCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String banjixiangceCollectionValue;



		//级联表 banjixiangce
			/**
			* 班级相册 的 用户
			*/
			private Integer banjixiangceYonghuId;
			/**
			* 班级相册名称
			*/
			private String banjixiangceName;
			/**
			* 相片
			*/
			private String banjixiangcePhoto;
			/**
			* 班级相册类型
			*/
			private Integer banjixiangceTypes;
				/**
				* 班级相册类型的值
				*/
				private String banjixiangceValue;
			/**
			* 点击次数
			*/
			private Integer banjixiangceClicknum;
			/**
			* 相片详情
			*/
			private String banjixiangceContent;
			/**
			* 逻辑删除
			*/
			private Integer banjixiangceDelete;

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

	public BanjixiangceCollectionView() {

	}

	public BanjixiangceCollectionView(BanjixiangceCollectionEntity banjixiangceCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, banjixiangceCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getBanjixiangceCollectionValue() {
				return banjixiangceCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setBanjixiangceCollectionValue(String banjixiangceCollectionValue) {
				this.banjixiangceCollectionValue = banjixiangceCollectionValue;
			}




				//级联表的get和set banjixiangce
					/**
					* 获取：班级相册 的 用户
					*/
					public Integer getBanjixiangceYonghuId() {
						return banjixiangceYonghuId;
					}
					/**
					* 设置：班级相册 的 用户
					*/
					public void setBanjixiangceYonghuId(Integer banjixiangceYonghuId) {
						this.banjixiangceYonghuId = banjixiangceYonghuId;
					}

					/**
					* 获取： 班级相册名称
					*/
					public String getBanjixiangceName() {
						return banjixiangceName;
					}
					/**
					* 设置： 班级相册名称
					*/
					public void setBanjixiangceName(String banjixiangceName) {
						this.banjixiangceName = banjixiangceName;
					}
					/**
					* 获取： 相片
					*/
					public String getBanjixiangcePhoto() {
						return banjixiangcePhoto;
					}
					/**
					* 设置： 相片
					*/
					public void setBanjixiangcePhoto(String banjixiangcePhoto) {
						this.banjixiangcePhoto = banjixiangcePhoto;
					}
					/**
					* 获取： 班级相册类型
					*/
					public Integer getBanjixiangceTypes() {
						return banjixiangceTypes;
					}
					/**
					* 设置： 班级相册类型
					*/
					public void setBanjixiangceTypes(Integer banjixiangceTypes) {
						this.banjixiangceTypes = banjixiangceTypes;
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
					/**
					* 获取： 点击次数
					*/
					public Integer getBanjixiangceClicknum() {
						return banjixiangceClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setBanjixiangceClicknum(Integer banjixiangceClicknum) {
						this.banjixiangceClicknum = banjixiangceClicknum;
					}
					/**
					* 获取： 相片详情
					*/
					public String getBanjixiangceContent() {
						return banjixiangceContent;
					}
					/**
					* 设置： 相片详情
					*/
					public void setBanjixiangceContent(String banjixiangceContent) {
						this.banjixiangceContent = banjixiangceContent;
					}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getBanjixiangceDelete() {
						return banjixiangceDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setBanjixiangceDelete(Integer banjixiangceDelete) {
						this.banjixiangceDelete = banjixiangceDelete;
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
