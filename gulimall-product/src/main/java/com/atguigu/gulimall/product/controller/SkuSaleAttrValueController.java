package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.SkuSaleAttrValueServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_sku_sale_attr_value")
public class SkuSaleAttrValueController {

    @Resource
    private SkuSaleAttrValueServiceImpl skuSaleAttrValueServiceImpl;

}
