package org.ywx.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ywx.common.utils.PageUtils;
import org.ywx.project.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:23:14
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

