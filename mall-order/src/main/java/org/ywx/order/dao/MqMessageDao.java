package org.ywx.order.dao;

import org.ywx.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:21:14
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
