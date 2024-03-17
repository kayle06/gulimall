package com.atguigu.gulimall.product.service;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.product.dao.CommentReplayDao;
import com.atguigu.gulimall.product.entity.CommentReplayEntity;
import com.atguigu.gulimall.product.service.impl.CommentReplayService;
@Service
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService{

}
