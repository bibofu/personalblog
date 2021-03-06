package cn.dblearn.blog.portal.operation.controller;

import cn.dblearn.blog.common.Result;
import cn.dblearn.blog.common.constants.RedisCacheNames;
import cn.dblearn.blog.entity.operation.vo.RecommendVO;
import cn.dblearn.blog.portal.operation.service.RecommendService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fubibo
 * @create 2021/12/07 11:34
 */


@RestController("recommendPortalController")
@CacheConfig(cacheNames = RedisCacheNames.RECOMMEND)
@RequestMapping("/operation")
public class RecommendController {

    @Resource
    private RecommendService recommendService;

    @RequestMapping("/recommends")
    @Cacheable(key = "'RECOMMEND'")
    public Result listRecommend() {
        List<RecommendVO> recommendList = recommendService.listRecommendVo();
        return Result.ok().put("recommendList",recommendList);
    }

    @RequestMapping("/hotReads")
    @Cacheable(key = "'HOTREAD'")
    public Result listHotRead () {
        List<RecommendVO> hotReadList = recommendService.listHotRead();
        return Result.ok().put("hotReadList",hotReadList);
    }
}
