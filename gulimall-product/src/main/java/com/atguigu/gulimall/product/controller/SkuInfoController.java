package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.SkuInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_sku_info")
public class SkuInfoController {

    @Resource
    private SkuInfoService skuInfoService;

}
