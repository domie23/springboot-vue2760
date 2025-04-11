package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 用户
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YonghuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


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
     * 性别
     */
    private Integer sexTypes;


    /**
     * 年龄
     */
    private Integer nianling;


    /**
     * 其他信息
     */
    private String yonghuText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：用户姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：用户姓名
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：用户手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 设置：用户手机号
	 */
    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：用户照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：用户照片
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 获取：地址
	 */
    public String getYonghuAddress() {
        return yonghuAddress;
    }


    /**
	 * 设置：地址
	 */
    public void setYonghuAddress(String yonghuAddress) {
        this.yonghuAddress = yonghuAddress;
    }
    /**
	 * 获取：QQ
	 */
    public String getYonghuQq() {
        return yonghuQq;
    }


    /**
	 * 设置：QQ
	 */
    public void setYonghuQq(String yonghuQq) {
        this.yonghuQq = yonghuQq;
    }
    /**
	 * 获取：微信
	 */
    public String getYonghuWeixin() {
        return yonghuWeixin;
    }


    /**
	 * 设置：微信
	 */
    public void setYonghuWeixin(String yonghuWeixin) {
        this.yonghuWeixin = yonghuWeixin;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：年龄
	 */
    public Integer getNianling() {
        return nianling;
    }


    /**
	 * 设置：年龄
	 */
    public void setNianling(Integer nianling) {
        this.nianling = nianling;
    }
    /**
	 * 获取：其他信息
	 */
    public String getYonghuText() {
        return yonghuText;
    }


    /**
	 * 设置：其他信息
	 */
    public void setYonghuText(String yonghuText) {
        this.yonghuText = yonghuText;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
