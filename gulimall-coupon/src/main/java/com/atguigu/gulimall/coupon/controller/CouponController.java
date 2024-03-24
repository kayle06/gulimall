package com.atguigu.gulimall.coupon.controller;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.atguigu.gulimall.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Objects;


@RefreshScope
@RestController
@RequestMapping("/coupon/coupon")
public class CouponController {

    @Resource
    private CouponService smsCouponService;

    @Value("${coupon.name}")
    private String name;
    @Value("${coupon.age}")
    private Integer age;
    @GetMapping("/getCouponInfo")
    public R membersCoupon() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减10");
        return R.ok().put("coupons", Collections.singletonList(couponEntity));
    }

    @RequestMapping("/test")
    public R test() {
        return Objects.requireNonNull(R.ok().put("name", name)).put("age", age);
    }
}
