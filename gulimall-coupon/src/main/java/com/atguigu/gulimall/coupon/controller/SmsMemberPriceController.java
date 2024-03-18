package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsMemberPriceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_member_price")
public class SmsMemberPriceController {

    @Resource
    private SmsMemberPriceService smsMemberPriceService;

}
