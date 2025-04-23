package com.dao;

import com.entity.ShuiwuqiankuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuiwuqiankuanView;

/**
 * 税务欠款 Dao 接口
 *
 * @author 
 */
public interface ShuiwuqiankuanDao extends BaseMapper<ShuiwuqiankuanEntity> {

   List<ShuiwuqiankuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
