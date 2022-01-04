package cn.dblearn.blog.entity.timeline;

import lombok.Data;

import java.util.List;

/**
 * @author fubibo
 * @create 2021/11/16 9:24
 */
@Data
public class Timeline {

    private Integer year;

    private Integer count;

    private List<TimelineMonth> months;
}
