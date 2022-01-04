package cn.dblearn.blog.manage.sys.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.sys.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author fubibo
 * @create 2021/11/22 12:46
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 查询用户菜单
     */
    List<Integer> queryAllMenuId(Integer userId);

    /**
     * 分页查询用户信息
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 更新密码
     */
    boolean updatePassword(Integer userId, String password, String newPassword);

    /**
     * 批量删除用户
     */
    void deleteBatch(Integer[] userIds);
}
