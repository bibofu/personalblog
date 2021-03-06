package cn.dblearn.blog.manage.sys.service.impl;

import cn.dblearn.blog.common.constants.SysConstants;
import cn.dblearn.blog.common.exception.MyException;
import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.common.util.Query;
import cn.dblearn.blog.entity.sys.SysRole;
import cn.dblearn.blog.mapper.sys.SysRoleMapper;
import cn.dblearn.blog.manage.sys.service.SysRoleMenuService;
import cn.dblearn.blog.manage.sys.service.SysRoleService;
import cn.dblearn.blog.manage.sys.service.SysUserRoleService;
import cn.dblearn.blog.manage.sys.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author fubibo
 * @create 2021/11/23 12:18
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysUserRoleService sysUserRoleService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String roleName = (String)params.get("roleName");
        Long createUserId = (Long)params.get("createUserId");
        IPage<SysRole> page=baseMapper.selectPage(new Query<SysRole>(params).getPage(),
                new QueryWrapper<SysRole>().lambda()
                .like(StringUtils.isNotBlank(roleName), SysRole::getRoleName,roleName)
                .eq(createUserId!=null, SysRole::getCreateUserId,createUserId)
        );
        return new PageUtils(page);
    }

    @Override
    public void deleteBatch(Integer[] roleIds) {
        //????????????
        this.removeByIds(Arrays.asList(roleIds));

        //???????????????????????????
        sysRoleMenuService.deleteBatchByRoleId(roleIds);

        //???????????????????????????
        sysUserRoleService.deleteBatchByRoleId(roleIds);
    }

    /**
     * ??????roleId
     */
    @Override
    public List<Integer> queryRoleIdList(Integer createUserId) {
        return baseMapper.queryRoleIdList(createUserId) ;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean save(SysRole role) {
        role.setCreateTime(new Date());
        baseMapper.insert(role);

        //????????????????????????
        checkPrems(role);

        //???????????????????????????
        sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());
        return true;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateById(SysRole role){
        baseMapper.updateById(role);

        //????????????????????????
        checkPrems(role);

        //???????????????????????????
        sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());
        return true;
    }


    /**
     * ????????????????????????
     */
    private void checkPrems(SysRole role){
        //???????????????????????????????????????????????????????????????????????????????????????
        if(SysConstants.SUPER_ADMIN.equals(role.getCreateUserId())){
            return ;
        }

        //????????????????????????????????????
        List<Integer> menuIdList = sysUserService.queryAllMenuId(role.getCreateUserId());

        //??????????????????
        if(!menuIdList.containsAll(role.getMenuIdList())){
            throw new MyException("???????????????????????????????????????????????????");
        }
    }
}
