package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 会员统计信息
 */
@Data
@TableName(value = "ums_member_statistics_info")
public class UmsMemberStatisticsInfoEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 会员id
     */
    @TableField(value = "member_id")
    private Long memberId;

    /**
     * 累计消费金额
     */
    @TableField(value = "consume_amount")
    private BigDecimal consumeAmount;

    /**
     * 累计优惠金额
     */
    @TableField(value = "coupon_amount")
    private BigDecimal couponAmount;

    /**
     * 订单数量
     */
    @TableField(value = "order_count")
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    @TableField(value = "coupon_count")
    private Integer couponCount;

    /**
     * 评价数
     */
    @TableField(value = "comment_count")
    private Integer commentCount;

    /**
     * 退货数量
     */
    @TableField(value = "return_order_count")
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    @TableField(value = "login_count")
    private Integer loginCount;

    /**
     * 关注数量
     */
    @TableField(value = "attend_count")
    private Integer attendCount;

    /**
     * 粉丝数量
     */
    @TableField(value = "fans_count")
    private Integer fansCount;

    /**
     * 收藏的商品数量
     */
    @TableField(value = "collect_product_count")
    private Integer collectProductCount;

    /**
     * 收藏的专题活动数量
     */
    @TableField(value = "collect_subject_count")
    private Integer collectSubjectCount;

    /**
     * 收藏的评论数量
     */
    @TableField(value = "collect_comment_count")
    private Integer collectCommentCount;

    /**
     * 邀请的朋友数量
     */
    @TableField(value = "invite_friend_count")
    private Integer inviteFriendCount;
}