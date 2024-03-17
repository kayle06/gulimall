package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.ProductAttrValueServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_product_attr_value")
public class ProductAttrValueController {

    @Resource
    private ProductAttrValueServiceImpl productAttrValueServiceImpl;

}
