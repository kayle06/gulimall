package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SeckillSkuNoticeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_seckill_sku_notice")
public class SeckillSkuNoticeController {

    @Resource
    private SeckillSkuNoticeService smsSeckillSkuNoticeService;

}
