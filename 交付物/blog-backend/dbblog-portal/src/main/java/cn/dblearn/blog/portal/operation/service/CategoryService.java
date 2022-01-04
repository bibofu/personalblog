package cn.dblearn.blog.portal.operation.service;

import cn.dblearn.blog.entity.operation.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author fubibo
 * @create 2021/12/07 10:03
 */
public interface CategoryService extends IService<Category> {

    /**
     * 获取categoryList
     */
    List<Category> listCategory(Map<String, Object> params);
}
