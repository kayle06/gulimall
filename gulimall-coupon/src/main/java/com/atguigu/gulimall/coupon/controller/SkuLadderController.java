package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SkuLadderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_sku_ladder")
public class SkuLadderController {

    @Resource
    private SkuLadderService smsSkuLadderService;

}
