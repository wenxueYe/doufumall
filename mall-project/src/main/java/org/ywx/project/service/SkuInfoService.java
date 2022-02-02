package org.ywx.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ywx.common.utils.PageUtils;
import org.ywx.project.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:23:15
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

