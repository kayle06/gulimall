package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.CouponHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_coupon_history")
public class CouponHistoryController {

    @Resource
    private CouponHistoryService smsCouponHistoryService;

}
