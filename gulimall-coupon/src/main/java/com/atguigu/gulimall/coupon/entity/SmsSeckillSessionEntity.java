package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动场次
 */
@Data
@TableName(value = "sms_seckill_session")
public class SmsSeckillSessionEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 场次名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 每日开始时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 每日结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 启用状态
     */
    @TableField(value = "`status`")
    private Boolean status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;
}