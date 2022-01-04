package cn.dblearn.blog.manage.book.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.book.BookNote;
import cn.dblearn.blog.entity.book.dto.BookNoteDTO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @author fubibo
 * @create 2021/11/18 12:19
 */

public interface BookNoteService extends IService<BookNote> {

    /**
     * 分页查询笔记列表
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存笔记笔记
     */
    void saveBookNote(BookNoteDTO blogBookNote);

    /**
     * 批量删除
     */
    void deleteBatch(Integer[] bookNoteIds);

    /**
     * 更新笔记
     */
    void updateBookNote(BookNoteDTO blogBookNote);

    /**
     * 获取笔记对象
     */
    BookNoteDTO getBookNote(Integer bookNoteId);

    /**
     * 判断该类别下是否有笔记
     */
    boolean checkByCategory(Integer categoryId);
}
