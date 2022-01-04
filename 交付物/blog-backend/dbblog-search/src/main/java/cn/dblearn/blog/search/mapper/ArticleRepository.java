package cn.dblearn.blog.search.mapper;

import cn.dblearn.blog.entity.article.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author fubibo
 * @create 2021/12/07 10:07
 */
@Component
public interface ArticleRepository extends ElasticsearchRepository<Article,Integer> {

}
