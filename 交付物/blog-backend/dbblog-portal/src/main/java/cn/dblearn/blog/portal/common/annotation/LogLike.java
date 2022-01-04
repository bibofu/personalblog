package cn.dblearn.blog.portal.common.annotation;

import java.lang.annotation.*;

/**
 * @author fubibo
 * @create 2021/12/02 14:53
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogLike {

     String type();
}
