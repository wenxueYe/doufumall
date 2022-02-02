package org.ywx.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ywx.common.utils.PageUtils;
import org.ywx.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:21:14
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

