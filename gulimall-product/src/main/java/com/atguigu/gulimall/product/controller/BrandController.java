package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_brand")
public class BrandController {

    @Resource
    private BrandService brandService;

}
