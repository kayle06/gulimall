package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 订单操作历史记录
 */
@Data
@TableName(value = "oms_order_operate_history")
public class OmsOrderOperateHistoryEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 操作人[用户；系统；后台管理员]
     */
    @TableField(value = "operate_man")
    private String operateMan;

    /**
     * 操作时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    @TableField(value = "order_status")
    private Byte orderStatus;

    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;
}