package com.dao;

import com.entity.ZhengcejieduCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengcejieduCollectionView;

/**
 * 政策解读收藏 Dao 接口
 *
 * @author 
 */
public interface ZhengcejieduCollectionDao extends BaseMapper<ZhengcejieduCollectionEntity> {

   List<ZhengcejieduCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
