package cn.dblearn.blog.portal.article.controller;


import cn.dblearn.blog.common.Result;
import cn.dblearn.blog.common.constants.RedisCacheNames;
import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.article.vo.ArticleVO;
import cn.dblearn.blog.portal.article.service.ArticleService;
import cn.dblearn.blog.portal.common.annotation.LogLike;
import cn.dblearn.blog.portal.common.annotation.LogView;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author fubibo
 * @create 2021/12/02 11:20
 */
@RestController("articlePortalController")
@CacheConfig(cacheNames = {RedisCacheNames.ARTICLE})
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @GetMapping("/article/{articleId}")
    @LogView(type = "article")
    public Result getArticle(@PathVariable Integer articleId){
        ArticleVO article = articleService.getArticleVo(articleId);
        return Result.ok().put("article",article);
    }

    @PutMapping("/article/like/{id}")
    @LogLike(type = "article")
    public Result likeArticle(@PathVariable Integer id) {
        return Result.ok();
    }

    @GetMapping("/articles")
    @Cacheable
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = articleService.queryPageCondition(params);
        return Result.ok().put("page",page);
    }


}
