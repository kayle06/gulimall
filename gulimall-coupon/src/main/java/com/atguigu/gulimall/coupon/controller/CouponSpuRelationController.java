package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.CouponSpuRelationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_coupon_spu_relation")
public class CouponSpuRelationController {

    @Resource
    private CouponSpuRelationService smsCouponSpuRelationService;

}
