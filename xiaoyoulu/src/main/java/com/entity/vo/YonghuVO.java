package com.entity.vo;

import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 用户
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yonghu")
public class YonghuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
