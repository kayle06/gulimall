package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品spu积分设置
 */
@Data
@TableName(value = "sms_spu_bounds")
public class SmsSpuBoundsEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "spu_id")
    private Long spuId;

    /**
     * 成长积分
     */
    @TableField(value = "grow_bounds")
    private BigDecimal growBounds;

    /**
     * 购物积分
     */
    @TableField(value = "buy_bounds")
    private BigDecimal buyBounds;

    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
    @TableField(value = "`work`")
    private Boolean work;
}