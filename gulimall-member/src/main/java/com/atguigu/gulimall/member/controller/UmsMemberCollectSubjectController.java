package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.UmsMemberCollectSubjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member_collect_subject")
public class UmsMemberCollectSubjectController {

    @Resource
    private UmsMemberCollectSubjectService umsMemberCollectSubjectService;

}
