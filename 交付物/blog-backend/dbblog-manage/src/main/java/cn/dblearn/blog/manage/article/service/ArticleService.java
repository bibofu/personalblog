package cn.dblearn.blog.manage.article.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.article.Article;
import cn.dblearn.blog.entity.article.dto.ArticleDTO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @author fubibo
 * @create 2021/11/16 13:36
 *
 */
public interface ArticleService extends IService<Article> {

    /**
     * 分页查询博文列表
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存博文文章
     */
    void saveArticle(ArticleDTO blogArticle);

    /**
     * 批量删除
     */
    void deleteBatch(Integer[] articleIds);

    /**
     * 更新博文
     */
    void updateArticle(ArticleDTO blogArticle);

    /**
     * 获取文章对象
     */
    ArticleDTO getArticle(Integer articleId);


    boolean checkByCategory(Integer id);
}
