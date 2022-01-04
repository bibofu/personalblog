package cn.dblearn.blog.manage.book.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.book.Book;
import cn.dblearn.blog.entity.book.dto.BookDTO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @author fubibo
 * @create 2021/11/18 12:41
 */

public interface BookService extends IService<Book> {

    /**
     * 分页查询
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存图书
     */
    void saveBook(BookDTO book);

    /**
     * 获取图书对象
     */
    BookDTO getBook(String id);

    /**
     * 更新图书
     */
    void updateBook(BookDTO book);

    /**
     * 批量删除
     */
    void deleteBatch(Integer[] bookIds);


    boolean checkByCategory(Integer categoryId);
}
