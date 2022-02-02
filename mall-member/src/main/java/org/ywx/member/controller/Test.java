package org.ywx.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
@RestController
@RequestMapping("member/test")
public class Test {
    @Autowired
    private CouponFeignService couponFeignService;

    @Value("${user.name}")
    private String username;


    /**
     * 会员的优惠券信息 -- cus
     */
    @RequestMapping("/coupons")
    public R test() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname(username);
        R menberCoupons = couponFeignService.memberCoupons();
        return R.ok().put("member",memberEntity).put("coupons",menberCoupons.get("coupons"));
    }
}
