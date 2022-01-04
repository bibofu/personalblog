package cn.dblearn.blog.manage.operation.mapper;

import cn.dblearn.blog.entity.operation.Recommend;
import cn.dblearn.blog.entity.operation.vo.RecommendVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/11/21 10:14
 */

@Mapper
public interface RecommendMapper extends BaseMapper<Recommend> {

    /**
     * 获取推荐文章列表
     */
    List<RecommendVO> listSelect();

    /**
     * 获取推荐列表
     */
    List<RecommendVO> listRecommendVo();

    /**
     * 获取最热列表
     */
    List<RecommendVO> listHotRead();
}
