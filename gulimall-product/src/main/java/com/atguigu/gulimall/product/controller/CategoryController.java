package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.CategoryServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_category")
public class CategoryController {

    @Resource
    private CategoryServiceImpl categoryServiceImpl;

}
