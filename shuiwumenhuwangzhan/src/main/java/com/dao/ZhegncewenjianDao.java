package com.dao;

import com.entity.ZhegncewenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhegncewenjianView;

/**
 * 政策文件 Dao 接口
 *
 * @author 
 */
public interface ZhegncewenjianDao extends BaseMapper<ZhegncewenjianEntity> {

   List<ZhegncewenjianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
