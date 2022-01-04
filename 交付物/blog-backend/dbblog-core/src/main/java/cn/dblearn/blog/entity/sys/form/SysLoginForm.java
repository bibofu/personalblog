package cn.dblearn.blog.entity.sys.form;

import lombok.Data;

/**
 * @author fubibo
 * @create 2021/12/07 10:21
 */
@Data
public class SysLoginForm {
    private String username;
    private String password;
    private String captcha;
    private String uuid;
}
