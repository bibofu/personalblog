package cn.dblearn.blog.portal.operation.service;

import cn.dblearn.blog.entity.operation.Link;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/12/07 10:04
 */
public interface LinkService extends IService<Link> {

    /**
     * 获取link列表
     */
    List<Link> listLink();
}
