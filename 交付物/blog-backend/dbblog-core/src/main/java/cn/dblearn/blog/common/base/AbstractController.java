package cn.dblearn.blog.common.base;

import cn.dblearn.blog.entity.sys.SysUser;
import org.apache.shiro.SecurityUtils;

/**
 * @author fubibo
 * @create 2021/10/22 12:35
 */
public class AbstractController {

    protected SysUser getUser(){
        return (SysUser) SecurityUtils.getSubject().getPrincipal();
    }

    protected Integer getUserId(){
        return getUser().getUserId();
    }
}
