package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.CategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

}
