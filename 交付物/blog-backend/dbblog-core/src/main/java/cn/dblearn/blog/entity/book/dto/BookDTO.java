package cn.dblearn.blog.entity.book.dto;

import cn.dblearn.blog.entity.book.Book;
import cn.dblearn.blog.entity.operation.Tag;
import lombok.Data;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/11/03 12:12
 */

@Data
public class BookDTO extends Book {

    List<Tag> tagList;
}
