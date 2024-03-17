package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.CommentReplayServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_comment_replay")
public class CommentReplayController {

    @Resource
    private CommentReplayServiceImpl commentReplayServiceImpl;

}
