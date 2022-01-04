package cn.dblearn.blog.entity.book.dto;

import cn.dblearn.blog.entity.book.BookNote;
import cn.dblearn.blog.entity.operation.Tag;
import lombok.Data;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/11/03 9:13
 */

@Data
public class BookNoteDTO extends BookNote {

    private List<Tag> tagList;

}
