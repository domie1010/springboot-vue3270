package com.dao;

import com.entity.NashuifuwutousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.NashuifuwutousuView;

/**
 * 纳税服务投诉 Dao 接口
 *
 * @author 
 */
public interface NashuifuwutousuDao extends BaseMapper<NashuifuwutousuEntity> {

   List<NashuifuwutousuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
