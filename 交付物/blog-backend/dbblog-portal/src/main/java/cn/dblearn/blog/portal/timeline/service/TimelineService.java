package cn.dblearn.blog.portal.timeline.service;

import cn.dblearn.blog.entity.timeline.Timeline;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/12/08 10:54
 */
public interface TimelineService {

    /**
     * 获取timeLine数据
     */
    List<Timeline> listTimeLine();
}
