package org.ywx.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ywx.common.utils.PageUtils;
import org.ywx.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:25:53
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

