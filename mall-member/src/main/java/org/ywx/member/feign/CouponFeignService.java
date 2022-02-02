package org.ywx.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ywx.common.utils.R;

/**
 * @Time : 2022/2/2 10:25
 * @Author : wenxue ye
 * @File : CouponFeignService
 * @Project : doufumall
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
