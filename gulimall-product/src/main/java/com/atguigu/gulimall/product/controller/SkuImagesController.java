package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.SkuImagesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_sku_images")
public class SkuImagesController {

    @Resource
    private SkuImagesService skuImagesService;

}
