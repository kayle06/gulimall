package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.SkuImagesServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_sku_images")
public class SkuImagesController {

    @Resource
    private SkuImagesServiceImpl skuImagesServiceImpl;

}
