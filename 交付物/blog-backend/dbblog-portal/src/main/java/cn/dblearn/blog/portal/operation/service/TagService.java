package cn.dblearn.blog.portal.operation.service;

import cn.dblearn.blog.entity.operation.Tag;
import cn.dblearn.blog.entity.operation.vo.TagVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/12/07 10:10
 */
public interface TagService extends IService<Tag> {

    /**
     * 获取tagVoList
     */
    List<TagVO> listTagVo();
}
