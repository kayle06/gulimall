package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsHomeAdvService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_home_adv")
public class SmsHomeAdvController {

    @Resource
    private SmsHomeAdvService smsHomeAdvService;

}
