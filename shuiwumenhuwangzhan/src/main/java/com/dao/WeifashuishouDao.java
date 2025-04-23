package com.dao;

import com.entity.WeifashuishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WeifashuishouView;

/**
 * 违法税收检举 Dao 接口
 *
 * @author 
 */
public interface WeifashuishouDao extends BaseMapper<WeifashuishouEntity> {

   List<WeifashuishouView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
