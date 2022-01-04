package cn.dblearn.blog.manage.sys.service;

import cn.dblearn.blog.entity.sys.SysUserRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/11/22 12:39
 */

public interface SysUserRoleService extends IService<SysUserRole> {

    /**
     * 批量删除roleId
     */
    void deleteBatchByRoleId(Integer[] roleIds);

    /**
     * 批量删除userId
     */
    void deleteBatchByUserId(Integer[] userIds);

    /**
     * 更新或保存用户角色
     */
    void saveOrUpdate(Integer userId, List<Integer> roleIdList);

    /**
     * 根据userId查询roleId
     */
    List<Integer> queryRoleIdList(Integer userId);
}
