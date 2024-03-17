package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.AttrGroupServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_attr_group")
public class AttrGroupController {

    @Resource
    private AttrGroupServiceImpl attrGroupServiceImpl;

}
