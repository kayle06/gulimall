package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.CategoryBrandRelationServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_category_brand_relation")
public class CategoryBrandRelationController {

    @Resource
    private CategoryBrandRelationServiceImpl categoryBrandRelationServiceImpl;

}
