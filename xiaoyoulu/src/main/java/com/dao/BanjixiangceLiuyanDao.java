package com.dao;

import com.entity.BanjixiangceLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjixiangceLiuyanView;

/**
 * 班级相册留言 Dao 接口
 *
 * @author 
 */
public interface BanjixiangceLiuyanDao extends BaseMapper<BanjixiangceLiuyanEntity> {

   List<BanjixiangceLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
