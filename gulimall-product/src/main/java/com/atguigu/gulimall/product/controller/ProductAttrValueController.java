package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.ProductAttrValueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_product_attr_value")
public class ProductAttrValueController {

    @Resource
    private ProductAttrValueService productAttrValueService;

}
