package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsCouponSpuRelationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_coupon_spu_relation")
public class SmsCouponSpuRelationController {

    @Resource
    private SmsCouponSpuRelationService smsCouponSpuRelationService;

}
