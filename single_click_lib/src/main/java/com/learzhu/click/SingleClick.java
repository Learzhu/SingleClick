package com.learzhu.click;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SingleClick {
    /**
     * 保存过滤点击间隔时间[单位毫秒]
     *
     * @return
     */
    int value() default 500;

    /**
     * 保存排除点击的控件ID数组
     *
     * @return
     */
    int[] except() default {};

    /**
     * 保存排除点击的控件的名称
     *
     * @return
     */
    String[] exceptIdName() default {};
}
