package com.atguigu.gulimall.member.controller;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.member.entity.MemberEntity;
import com.atguigu.gulimall.member.feign.CouponFeignService;
import com.atguigu.gulimall.member.service.GrowthChangeHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Objects;


@RestController
@RequestMapping("/member/member")
public class GrowthChangeHistoryController {

    @Resource
    private GrowthChangeHistoryService umsGrowthChangeHistoryService;
    @Resource
    private CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R test() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("test");

        R r = couponFeignService.membersCoupon();
        return Objects.requireNonNull(R.ok().put("member", memberEntity)).put("coupons", r.get("coupons"));
    }
}
