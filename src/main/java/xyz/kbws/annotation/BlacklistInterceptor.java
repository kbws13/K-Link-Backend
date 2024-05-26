package xyz.kbws.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: 黑名单拦截器
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface BlacklistInterceptor {
    /**
     * 拦截字段的标识符
     *
     * @return {@link String }
     */
    String key() default "default";

    /**
     * 频率限制 每秒请求次数
     *
     * @return double
     */
    long rageLimit() default 10;

    /**
     * 保护限制 命中频率次数后触发保护，默认触发限制就保护进入黑名单
     *
     * @return int
     */
    int protectLimit() default 1;

    /**
     * 回调方法
     *
     * @return {@link String }
     */
    String fallbackMethod();
}
