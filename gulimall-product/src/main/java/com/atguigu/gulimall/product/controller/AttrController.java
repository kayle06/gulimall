package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.AttrServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_attr")
public class AttrController {

    @Resource
    private AttrServiceImpl attrServiceImpl;

}
