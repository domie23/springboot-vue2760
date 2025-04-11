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
 * 班级相册
 *
 * @author 
 * @email
 */
@TableName("banjixiangce")
public class BanjixiangceEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BanjixiangceEntity() {

	}

	public BanjixiangceEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 班级相册名称
     */
    @TableField(value = "banjixiangce_name")

    private String banjixiangceName;


    /**
     * 相片
     */
    @TableField(value = "banjixiangce_photo")

    private String banjixiangcePhoto;


    /**
     * 班级相册类型
     */
    @TableField(value = "banjixiangce_types")

    private Integer banjixiangceTypes;


    /**
     * 点击次数
     */
    @TableField(value = "banjixiangce_clicknum")

    private Integer banjixiangceClicknum;


    /**
     * 相片详情
     */
    @TableField(value = "banjixiangce_content")

    private String banjixiangceContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "banjixiangce_delete")

    private Integer banjixiangceDelete;


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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：班级相册名称
	 */
    public String getBanjixiangceName() {
        return banjixiangceName;
    }


    /**
	 * 获取：班级相册名称
	 */

    public void setBanjixiangceName(String banjixiangceName) {
        this.banjixiangceName = banjixiangceName;
    }
    /**
	 * 设置：相片
	 */
    public String getBanjixiangcePhoto() {
        return banjixiangcePhoto;
    }


    /**
	 * 获取：相片
	 */

    public void setBanjixiangcePhoto(String banjixiangcePhoto) {
        this.banjixiangcePhoto = banjixiangcePhoto;
    }
    /**
	 * 设置：班级相册类型
	 */
    public Integer getBanjixiangceTypes() {
        return banjixiangceTypes;
    }


    /**
	 * 获取：班级相册类型
	 */

    public void setBanjixiangceTypes(Integer banjixiangceTypes) {
        this.banjixiangceTypes = banjixiangceTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getBanjixiangceClicknum() {
        return banjixiangceClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setBanjixiangceClicknum(Integer banjixiangceClicknum) {
        this.banjixiangceClicknum = banjixiangceClicknum;
    }
    /**
	 * 设置：相片详情
	 */
    public String getBanjixiangceContent() {
        return banjixiangceContent;
    }


    /**
	 * 获取：相片详情
	 */

    public void setBanjixiangceContent(String banjixiangceContent) {
        this.banjixiangceContent = banjixiangceContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getBanjixiangceDelete() {
        return banjixiangceDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setBanjixiangceDelete(Integer banjixiangceDelete) {
        this.banjixiangceDelete = banjixiangceDelete;
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
        return "Banjixiangce{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", banjixiangceName=" + banjixiangceName +
            ", banjixiangcePhoto=" + banjixiangcePhoto +
            ", banjixiangceTypes=" + banjixiangceTypes +
            ", banjixiangceClicknum=" + banjixiangceClicknum +
            ", banjixiangceContent=" + banjixiangceContent +
            ", banjixiangceDelete=" + banjixiangceDelete +
            ", createTime=" + createTime +
        "}";
    }
}
