package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsCouponService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_coupon")
public class SmsCouponController {

    @Resource
    private SmsCouponService smsCouponService;

}
