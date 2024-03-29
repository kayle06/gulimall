package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券领取历史记录
 */
@Data
@TableName(value = "sms_coupon_history")
public class CouponHistoryEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 优惠券id
     */
    @TableField(value = "coupon_id")
    private Long couponId;

    /**
     * 会员id
     */
    @TableField(value = "member_id")
    private Long memberId;

    /**
     * 会员名字
     */
    @TableField(value = "member_nick_name")
    private String memberNickName;

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    @TableField(value = "get_type")
    private Boolean getType;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    @TableField(value = "use_type")
    private Boolean useType;

    /**
     * 使用时间
     */
    @TableField(value = "use_time")
    private Date useTime;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 订单号
     */
    @TableField(value = "order_sn")
    private Long orderSn;
}