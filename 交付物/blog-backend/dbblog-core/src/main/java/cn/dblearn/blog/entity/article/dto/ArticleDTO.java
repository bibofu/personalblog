package cn.dblearn.blog.entity.article.dto;

import cn.dblearn.blog.entity.article.Article;
import cn.dblearn.blog.entity.operation.Tag;
import lombok.Data;

import java.util.List;

/**
 * @author fubibo
 * @create  2021-11-08 10:22
 */

@Data
public class ArticleDTO extends Article {

    private List<Tag> tagList;

}
