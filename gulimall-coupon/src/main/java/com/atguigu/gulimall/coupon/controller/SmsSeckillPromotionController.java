package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsSeckillPromotionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_seckill_promotion")
public class SmsSeckillPromotionController {

    @Resource
    private SmsSeckillPromotionService smsSeckillPromotionService;

}
