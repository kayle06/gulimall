package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SpuBoundsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_spu_bounds")
public class SpuBoundsController {

    @Resource
    private SpuBoundsService smsSpuBoundsService;

}
