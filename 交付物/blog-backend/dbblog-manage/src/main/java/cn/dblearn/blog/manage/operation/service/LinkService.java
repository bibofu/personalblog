package cn.dblearn.blog.manage.operation.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.operation.Link;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @author fubibo
 * @create 2021/11/21 13:23
 */
public interface LinkService extends IService<Link> {

    /**
     * 分页查询
     */
     PageUtils queryPage(Map<String, Object> params);
}
