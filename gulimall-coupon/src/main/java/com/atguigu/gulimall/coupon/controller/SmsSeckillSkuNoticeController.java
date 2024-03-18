package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsSeckillSkuNoticeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_seckill_sku_notice")
public class SmsSeckillSkuNoticeController {

    @Resource
    private SmsSeckillSkuNoticeService smsSeckillSkuNoticeService;

}
