package com.entity.model;

import com.entity.BanjixiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 班级相册
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BanjixiangceModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


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


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：班级相册名称
	 */
    public String getBanjixiangceName() {
        return banjixiangceName;
    }


    /**
	 * 设置：班级相册名称
	 */
    public void setBanjixiangceName(String banjixiangceName) {
        this.banjixiangceName = banjixiangceName;
    }
    /**
	 * 获取：相片
	 */
    public String getBanjixiangcePhoto() {
        return banjixiangcePhoto;
    }


    /**
	 * 设置：相片
	 */
    public void setBanjixiangcePhoto(String banjixiangcePhoto) {
        this.banjixiangcePhoto = banjixiangcePhoto;
    }
    /**
	 * 获取：班级相册类型
	 */
    public Integer getBanjixiangceTypes() {
        return banjixiangceTypes;
    }


    /**
	 * 设置：班级相册类型
	 */
    public void setBanjixiangceTypes(Integer banjixiangceTypes) {
        this.banjixiangceTypes = banjixiangceTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getBanjixiangceClicknum() {
        return banjixiangceClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setBanjixiangceClicknum(Integer banjixiangceClicknum) {
        this.banjixiangceClicknum = banjixiangceClicknum;
    }
    /**
	 * 获取：相片详情
	 */
    public String getBanjixiangceContent() {
        return banjixiangceContent;
    }


    /**
	 * 设置：相片详情
	 */
    public void setBanjixiangceContent(String banjixiangceContent) {
        this.banjixiangceContent = banjixiangceContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getBanjixiangceDelete() {
        return banjixiangceDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setBanjixiangceDelete(Integer banjixiangceDelete) {
        this.banjixiangceDelete = banjixiangceDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
