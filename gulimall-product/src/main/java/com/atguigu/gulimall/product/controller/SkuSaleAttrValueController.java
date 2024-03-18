package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.SkuSaleAttrValueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_sku_sale_attr_value")
public class SkuSaleAttrValueController {

    @Resource
    private SkuSaleAttrValueService skuSaleAttrValueService;

}
