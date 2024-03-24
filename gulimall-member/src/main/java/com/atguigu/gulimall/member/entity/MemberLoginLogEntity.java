package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 会员登录记录
 */
@Data
@TableName(value = "ums_member_login_log")
public class MemberLoginLogEntity {
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
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * ip
     */
    @TableField(value = "ip")
    private String ip;

    /**
     * city
     */
    @TableField(value = "city")
    private String city;

    /**
     * 登录类型[1-web，2-app]
     */
    @TableField(value = "login_type")
    private Boolean loginType;
}