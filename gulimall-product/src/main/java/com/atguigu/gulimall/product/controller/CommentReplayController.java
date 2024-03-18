package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.CommentReplayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_comment_replay")
public class CommentReplayController {

    @Resource
    private CommentReplayService commentReplayService;

}
