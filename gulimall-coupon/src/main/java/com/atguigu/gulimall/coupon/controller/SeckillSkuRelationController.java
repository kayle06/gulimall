package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SeckillSkuRelationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_seckill_sku_relation")
public class SeckillSkuRelationController {

    @Resource
    private SeckillSkuRelationService smsSeckillSkuRelationService;

}
