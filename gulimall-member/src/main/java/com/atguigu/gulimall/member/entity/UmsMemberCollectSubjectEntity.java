package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 会员收藏的专题活动
 */
@Data
@TableName(value = "ums_member_collect_subject")
public class UmsMemberCollectSubjectEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * subject_id
     */
    @TableField(value = "subject_id")
    private Long subjectId;

    /**
     * subject_name
     */
    @TableField(value = "subject_name")
    private String subjectName;

    /**
     * subject_img
     */
    @TableField(value = "subject_img")
    private String subjectImg;

    /**
     * 活动url
     */
    @TableField(value = "subject_urll")
    private String subjectUrll;
}