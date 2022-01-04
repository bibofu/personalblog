package cn.dblearn.blog.manage.sys.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.sys.SysParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @author fubibo
 * @create 2021/11/22 10:32
 */
public interface SysParamService extends IService<SysParam> {

    /**
     * 分页查询
     */
     PageUtils queryPage(Map<String, Object> params);
}
