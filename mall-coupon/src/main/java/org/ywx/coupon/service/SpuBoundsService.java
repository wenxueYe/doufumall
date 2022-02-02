package org.ywx.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ywx.common.utils.PageUtils;
import org.ywx.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:24:40
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

