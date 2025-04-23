package com.dao;

import com.entity.ZhengcejieduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengcejieduView;

/**
 * 政策解读 Dao 接口
 *
 * @author 
 */
public interface ZhengcejieduDao extends BaseMapper<ZhengcejieduEntity> {

   List<ZhengcejieduView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
