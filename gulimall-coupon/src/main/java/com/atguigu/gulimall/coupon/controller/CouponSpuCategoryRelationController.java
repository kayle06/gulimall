package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.CouponSpuCategoryRelationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationController {

    @Resource
    private CouponSpuCategoryRelationService smsCouponSpuCategoryRelationService;

}
