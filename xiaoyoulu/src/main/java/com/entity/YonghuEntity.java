package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 用户
 *
 * @author 
 * @email
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghuEntity() {

	}

	public YonghuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 用户姓名
     */
    @TableField(value = "yonghu_name")

    private String yonghuName;


    /**
     * 用户手机号
     */
    @TableField(value = "yonghu_phone")

    private String yonghuPhone;


    /**
     * 用户照片
     */
    @TableField(value = "yonghu_photo")

    private String yonghuPhoto;


    /**
     * 电子邮箱
     */
    @TableField(value = "yonghu_email")

    private String yonghuEmail;


    /**
     * 地址
     */
    @TableField(value = "yonghu_address")

    private String yonghuAddress;


    /**
     * QQ
     */
    @TableField(value = "yonghu_qq")

    private String yonghuQq;


    /**
     * 微信
     */
    @TableField(value = "yonghu_weixin")

    private String yonghuWeixin;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 年龄
     */
    @TableField(value = "nianling")

    private Integer nianling;


    /**
     * 其他信息
     */
    @TableField(value = "yonghu_text")

    private String yonghuText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：用户姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 获取：用户姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：用户手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 获取：用户手机号
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 设置：用户照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 获取：用户照片
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 设置：地址
	 */
    public String getYonghuAddress() {
        return yonghuAddress;
    }


    /**
	 * 获取：地址
	 */

    public void setYonghuAddress(String yonghuAddress) {
        this.yonghuAddress = yonghuAddress;
    }
    /**
	 * 设置：QQ
	 */
    public String getYonghuQq() {
        return yonghuQq;
    }


    /**
	 * 获取：QQ
	 */

    public void setYonghuQq(String yonghuQq) {
        this.yonghuQq = yonghuQq;
    }
    /**
	 * 设置：微信
	 */
    public String getYonghuWeixin() {
        return yonghuWeixin;
    }


    /**
	 * 获取：微信
	 */

    public void setYonghuWeixin(String yonghuWeixin) {
        this.yonghuWeixin = yonghuWeixin;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：年龄
	 */
    public Integer getNianling() {
        return nianling;
    }


    /**
	 * 获取：年龄
	 */

    public void setNianling(Integer nianling) {
        this.nianling = nianling;
    }
    /**
	 * 设置：其他信息
	 */
    public String getYonghuText() {
        return yonghuText;
    }


    /**
	 * 获取：其他信息
	 */

    public void setYonghuText(String yonghuText) {
        this.yonghuText = yonghuText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yonghu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yonghuName=" + yonghuName +
            ", yonghuPhone=" + yonghuPhone +
            ", yonghuPhoto=" + yonghuPhoto +
            ", yonghuEmail=" + yonghuEmail +
            ", yonghuAddress=" + yonghuAddress +
            ", yonghuQq=" + yonghuQq +
            ", yonghuWeixin=" + yonghuWeixin +
            ", sexTypes=" + sexTypes +
            ", nianling=" + nianling +
            ", yonghuText=" + yonghuText +
            ", createTime=" + createTime +
        "}";
    }
}
