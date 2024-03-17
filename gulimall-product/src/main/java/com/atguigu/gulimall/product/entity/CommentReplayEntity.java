package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 商品评价回复关系
 */
@Data
@TableName(value = "pms_comment_replay")
public class CommentReplayEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 评论id
     */
    @TableField(value = "comment_id")
    private Long commentId;

    /**
     * 回复id
     */
    @TableField(value = "reply_id")
    private Long replyId;
}