package cn.dblearn.blog.manage.book.service;

import cn.dblearn.blog.entity.book.BookSense;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author fubibo
 * @create 2021/11/18 12:34
 */
public interface BookSenseService extends IService<BookSense> {

    /**
     * 获取读后感
     */
    BookSense getBookSense(Integer bookId);
}
