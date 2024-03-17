package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.SkuInfoServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_sku_info")
public class SkuInfoController {

    @Resource
    private SkuInfoServiceImpl skuInfoServiceImpl;

}
