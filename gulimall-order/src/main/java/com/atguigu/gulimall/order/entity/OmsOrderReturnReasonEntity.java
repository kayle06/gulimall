package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 退货原因
 */
@Data
@TableName(value = "oms_order_return_reason")
public class OmsOrderReturnReasonEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 退货原因名
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 启用状态
     */
    @TableField(value = "`status`")
    private Boolean status;

    /**
     * create_time
     */
    @TableField(value = "create_time")
    private Date createTime;
}