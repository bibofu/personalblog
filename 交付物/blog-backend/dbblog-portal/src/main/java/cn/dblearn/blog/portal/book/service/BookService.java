package cn.dblearn.blog.portal.book.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.book.Book;
import cn.dblearn.blog.entity.book.vo.BookVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;


/**
 * @author fubibo
 * @create 2021/12/02 11:45
 */
public interface BookService extends IService<Book> {

    /**
     * 分页分类获取列表
     */
    PageUtils queryPageCondition(Map<String, Object> params);

    /**
     * 获取Book对象
     */
    BookVO getBookVo(Integer id);
}
