package cn.dblearn.blog.portal.operation.service.impl;

import cn.dblearn.blog.entity.operation.Link;
import cn.dblearn.blog.mapper.operation.LinkMapper;
import cn.dblearn.blog.portal.operation.service.LinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/12/07 14:23
 */
@Service("linkPortalService")
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {


    /**
     * 获取link列表
     */
    @Override
    public List<Link> listLink() {
        return baseMapper.selectList(null);
    }
}
