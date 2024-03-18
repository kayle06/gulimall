package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 会员等级
 */
@Data
@TableName(value = "ums_member_level")
public class UmsMemberLevelEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 等级名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 等级需要的成长值
     */
    @TableField(value = "growth_point")
    private Integer growthPoint;

    /**
     * 是否为默认等级[0->不是；1->是]
     */
    @TableField(value = "default_status")
    private Byte defaultStatus;

    /**
     * 免运费标准
     */
    @TableField(value = "free_freight_point")
    private BigDecimal freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    @TableField(value = "comment_growth_point")
    private Integer commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    @TableField(value = "priviledge_free_freight")
    private Byte priviledgeFreeFreight;

    /**
     * 是否有会员价格特权
     */
    @TableField(value = "priviledge_member_price")
    private Byte priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    @TableField(value = "priviledge_birthday")
    private Byte priviledgeBirthday;

    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;
}