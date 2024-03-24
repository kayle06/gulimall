package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName CouponFeignService
 * @Description 优惠券远程调用
 * @Author zhangxuan
 * @Version 1.0
 * @Date 2024/3/21 22:23
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @GetMapping("/coupon/coupon/getCouponInfo")
    public R membersCoupon();

}
