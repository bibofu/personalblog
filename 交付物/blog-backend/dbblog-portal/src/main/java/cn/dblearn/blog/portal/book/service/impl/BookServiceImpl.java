package cn.dblearn.blog.portal.book.service.impl;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.common.util.Query;
import cn.dblearn.blog.entity.book.Book;
import cn.dblearn.blog.entity.book.vo.BookVO;
import cn.dblearn.blog.mapper.book.BookMapper;
import cn.dblearn.blog.portal.book.service.BookService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author fubibo
 * @create 2021/12/02 13:32
 */
@Service("bookPortalService")
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {


    /**
     * 分页分类获取列表
     */
    @Override
    public PageUtils queryPageCondition(Map<String, Object> params) {
        Page<BookVO> page = new Query<BookVO>(params).getPage();
        List<BookVO> bookList = baseMapper.queryPageCondition(page, params);
        page.setRecords(bookList);
        return new PageUtils(page);
    }

    /**
     * 获取Book对象
     */
    @Override
    public BookVO getBookVo(Integer id) {
        return this.baseMapper.selectByIdWithSubList(id);
    }
}
