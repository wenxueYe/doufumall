package org.ywx.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ywx.common.utils.PageUtils;
import org.ywx.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:25:53
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

