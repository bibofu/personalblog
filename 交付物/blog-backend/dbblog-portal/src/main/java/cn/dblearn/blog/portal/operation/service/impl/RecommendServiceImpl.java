package cn.dblearn.blog.portal.operation.service.impl;

import cn.dblearn.blog.common.enums.ModuleEnum;
import cn.dblearn.blog.entity.article.vo.ArticleVO;
import cn.dblearn.blog.entity.book.vo.BookNoteVO;
import cn.dblearn.blog.entity.operation.Recommend;
import cn.dblearn.blog.entity.operation.vo.RecommendVO;
import cn.dblearn.blog.manage.operation.mapper.RecommendMapper;
import cn.dblearn.blog.portal.article.service.ArticleService;
import cn.dblearn.blog.portal.book.service.BookNoteService;
import cn.dblearn.blog.portal.operation.service.RecommendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fubibo
 * @create 2021/12/07 14:36
 */
@Service("recommendPortalService")
public class RecommendServiceImpl extends ServiceImpl<RecommendMapper, Recommend> implements RecommendService {

    @Resource
    private ArticleService articleService;

    @Resource
    private BookNoteService bookNoteService;


    @Override
    public List<RecommendVO> listRecommendVo() {
        List<RecommendVO> recommendList =this.baseMapper.listRecommendVo();
        return genRecommendList(recommendList);
    }

    @Override
    public List<RecommendVO> listHotRead() {
        List<RecommendVO> hotReadList =this.baseMapper.listHotRead();
        genRecommendList(hotReadList);
        hotReadList.get(0).setTop(true);
        return hotReadList;
    }

    private List<RecommendVO> genRecommendList(List<RecommendVO> recommendList) {
        recommendList.forEach(recommendVo -> {
            if(ModuleEnum.ARTICLE.getValue() == recommendVo.getType()){
                ArticleVO simpleArticleVo = articleService.getSimpleArticleVo(recommendVo.getLinkId());
                BeanUtils.copyProperties(simpleArticleVo,recommendVo);
                recommendVo.setUrlType("article");
            }else if(ModuleEnum.BOOK_NOTE.getValue() == recommendVo.getType()) {
                BookNoteVO simpleBookNoteVo = bookNoteService.getSimpleBookNoteVo(recommendVo.getLinkId());
                recommendVo.setUrlType("bookNote");
                BeanUtils.copyProperties(simpleBookNoteVo,recommendVo);
            }
        });
        return recommendList;
    }
}
