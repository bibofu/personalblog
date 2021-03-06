package cn.dblearn.blog.manage.sys.service;

import cn.dblearn.blog.entity.sys.SysRoleMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/11/22 10:58
 */
@Service
public interface SysRoleMenuService extends IService<SysRoleMenu> {


    void saveOrUpdate(Integer roleId, List<Integer> menuIdList);

    List<Integer> queryMenuIdList(Integer roleId);

    void deleteBatchByRoleId(Integer[] roleIds);
}
