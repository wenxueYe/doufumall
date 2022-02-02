package org.ywx.ware.dao;

import org.ywx.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:26:57
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
