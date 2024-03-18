package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsSpuBoundsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_spu_bounds")
public class SmsSpuBoundsController {

    @Resource
    private SmsSpuBoundsService smsSpuBoundsService;

}
