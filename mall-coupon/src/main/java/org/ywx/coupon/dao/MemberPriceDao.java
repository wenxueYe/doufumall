package org.ywx.coupon.dao;

import org.ywx.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:24:40
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
