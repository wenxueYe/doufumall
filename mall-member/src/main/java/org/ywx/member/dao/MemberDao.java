package org.ywx.member.dao;

import org.ywx.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:25:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
