package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SkuFullReductionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_sku_full_reduction")
public class SkuFullReductionController {

    @Resource
    private SkuFullReductionService smsSkuFullReductionService;

}
