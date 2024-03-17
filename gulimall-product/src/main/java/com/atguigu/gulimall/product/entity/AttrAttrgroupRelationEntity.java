package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 属性&属性分组关联
 */
@Data
@TableName(value = "pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 属性id
     */
    @TableField(value = "attr_id")
    private Long attrId;

    /**
     * 属性分组id
     */
    @TableField(value = "attr_group_id")
    private Long attrGroupId;

    /**
     * 属性组内排序
     */
    @TableField(value = "attr_sort")
    private Integer attrSort;
}