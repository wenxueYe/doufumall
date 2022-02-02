package org.ywx.project.dao;

import org.ywx.project.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:23:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
