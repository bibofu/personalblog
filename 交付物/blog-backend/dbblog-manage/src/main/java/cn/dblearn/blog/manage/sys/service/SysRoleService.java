package cn.dblearn.blog.manage.sys.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.sys.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author fubibo
 * @create 2021/11/22 11:09
 */
public interface SysRoleService extends IService<SysRole> {

    /**
     * 分页查询角色
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 批量删除
     */
    void deleteBatch(Integer[] roleIds);

    /**
     * 查询roleId
     */
    List<Integer> queryRoleIdList(Integer createUserId);
}
