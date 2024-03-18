package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 支付信息表
 */
@Data
@TableName(value = "oms_payment_info")
public class OmsPaymentInfoEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单号（对外业务号）
     */
    @TableField(value = "order_sn")
    private String orderSn;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 支付宝交易流水号
     */
    @TableField(value = "alipay_trade_no")
    private String alipayTradeNo;

    /**
     * 支付总金额
     */
    @TableField(value = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 交易内容
     */
    @TableField(value = "subject")
    private String subject;

    /**
     * 支付状态
     */
    @TableField(value = "payment_status")
    private String paymentStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 确认时间
     */
    @TableField(value = "confirm_time")
    private Date confirmTime;

    /**
     * 回调内容
     */
    @TableField(value = "callback_content")
    private String callbackContent;

    /**
     * 回调时间
     */
    @TableField(value = "callback_time")
    private Date callbackTime;
}