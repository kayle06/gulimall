package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.UmsMemberCollectSpuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member_collect_spu")
public class UmsMemberCollectSpuController {

    @Resource
    private UmsMemberCollectSpuService umsMemberCollectSpuService;

}
