package cn.gosilver.middleware.whitelist.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解 DoWhiteList
 *
 * Author: chensh
 * Date: 2024/9/14 11:44 AM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoWhiteList {

    /**
     * 配置当前接口入参需要提取的属性
     *
     * @return
     */
    String key() default "";

    /**
     * 拦截到用户请求后需要给一个返回信息
     *
     * @return
     */
    String returnJson() default "";

}
