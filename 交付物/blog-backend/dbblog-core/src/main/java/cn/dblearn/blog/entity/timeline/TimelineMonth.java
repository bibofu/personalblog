package cn.dblearn.blog.entity.timeline;

import lombok.Data;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/11/16 12:28
 */
@Data
public class TimelineMonth {

    private Integer month;

    private Integer count;

    private List<TimelinePost> posts;

}
