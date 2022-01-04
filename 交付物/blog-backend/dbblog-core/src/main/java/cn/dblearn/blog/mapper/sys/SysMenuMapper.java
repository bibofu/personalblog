package cn.dblearn.blog.mapper.sys;

import cn.dblearn.blog.entity.sys.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author fubibo
 * @create  2021-11-07 15:05
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * 查询非按钮的菜单
     */
    List<SysMenu> queryNotButtonList();

    /**
     * 根据parentId查询菜单
     */
    List<SysMenu> queryListParentId(Integer parentId);
}
