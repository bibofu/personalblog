package cn.dblearn.blog.manage.operation.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.operation.Recommend;
import cn.dblearn.blog.entity.operation.vo.RecommendVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author fubibo
 * @create 2021/11/21 14:33
 */
public interface RecommendService extends IService<Recommend> {

    /**
     * 分页查询
     */
     PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取推荐列表
     */
    List<RecommendVO> listSelect();

    /**
     * 更新置顶状态
     */
    void updateTop(Integer id);

    /**
     * 批量删除
     */
    void deleteBatchByLinkId(Integer[] articleIds, int value);
}
