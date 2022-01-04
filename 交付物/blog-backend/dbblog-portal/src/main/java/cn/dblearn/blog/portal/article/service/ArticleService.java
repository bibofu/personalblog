package cn.dblearn.blog.portal.article.service;


import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.article.Article;
import cn.dblearn.blog.entity.article.vo.ArticleVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @author fubibo
 * @create 2021/12/02 10:34
 */
public interface ArticleService extends IService<Article> {

    /**
     * 分页分类获取列表
     */
    PageUtils queryPageCondition(Map<String, Object> params);

    /**
     * 获取ArticleVo对象
     */
    ArticleVO getArticleVo(Integer articleId);

    /**
     * 获取简单的Article对象
     */
     ArticleVO getSimpleArticleVo(Integer articleId);

}
