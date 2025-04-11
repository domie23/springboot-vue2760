package com.dao;

import com.entity.BanjixiangceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjixiangceView;

/**
 * 班级相册 Dao 接口
 *
 * @author 
 */
public interface BanjixiangceDao extends BaseMapper<BanjixiangceEntity> {

   List<BanjixiangceView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
