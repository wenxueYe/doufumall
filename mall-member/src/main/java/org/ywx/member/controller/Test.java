package org.ywx.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ywx.common.utils.R;
import org.ywx.member.entity.MemberEntity;
import org.ywx.member.feign.CouponFeignService;

/**
 * @Time : 2022/2/2 10:28
 * @Author : wenxue ye
 * @File : Test
 * @Project : doufumall
 */
@RestController
@RequestMapping("member/test")
public class Test {
    @Autowired
    private CouponFeignService couponFeignService;

    /**
     * 会员的优惠券信息 -- cus
     */
    @RequestMapping("/coupons")
    public R test() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");
        R menberCoupons = couponFeignService.memberCoupons();
        return R.ok().put("member",memberEntity).put("coupons",menberCoupons.get("coupons"));
    }
}
