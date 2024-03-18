package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.SpuImagesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_spu_images")
public class SpuImagesController {

    @Resource
    private SpuImagesService spuImagesService;

}
