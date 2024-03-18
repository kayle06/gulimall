package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsCouponHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_coupon_history")
public class SmsCouponHistoryController {

    @Resource
    private SmsCouponHistoryService smsCouponHistoryService;

}
