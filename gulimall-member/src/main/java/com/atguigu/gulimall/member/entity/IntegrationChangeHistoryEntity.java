package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 积分变化历史记录
 */
@Data
@TableName(value = "ums_integration_change_history")
public class IntegrationChangeHistoryEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * member_id
     */
    @TableField(value = "member_id")
    private Long memberId;

    /**
     * create_time
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 变化的值
     */
    @TableField(value = "change_count")
    private Integer changeCount;

    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;

    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    @TableField(value = "source_tyoe")
    private Byte sourceTyoe;
}