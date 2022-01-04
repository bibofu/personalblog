package cn.dblearn.blog.common.mq.annotation;

import java.lang.annotation.*;

/**
 * @author fubibo
 * @create 2021/10/20 8:32
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RefreshEsMqSender {
    String sender();

    String msg() default "send refresh msg to ElasticSearch";

}
