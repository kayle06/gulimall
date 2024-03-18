package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 订单配置信息
 */
@Data
@TableName(value = "oms_order_setting")
public class OmsOrderSettingEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 秒杀订单超时关闭时间(分)
     */
    @TableField(value = "flash_order_overtime")
    private Integer flashOrderOvertime;

    /**
     * 正常订单超时时间(分)
     */
    @TableField(value = "normal_order_overtime")
    private Integer normalOrderOvertime;

    /**
     * 发货后自动确认收货时间（天）
     */
    @TableField(value = "confirm_overtime")
    private Integer confirmOvertime;

    /**
     * 自动完成交易时间，不能申请退货（天）
     */
    @TableField(value = "finish_overtime")
    private Integer finishOvertime;

    /**
     * 订单完成后自动好评时间（天）
     */
    @TableField(value = "comment_overtime")
    private Integer commentOvertime;

    /**
     * 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
     */
    @TableField(value = "member_level")
    private Byte memberLevel;
}