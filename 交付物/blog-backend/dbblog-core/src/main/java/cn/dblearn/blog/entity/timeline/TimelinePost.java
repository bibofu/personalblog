package cn.dblearn.blog.entity.timeline;

import lombok.Data;

import java.util.Date;

/**
 * @author fubibo
 * @create 2021/11/16 19:04
 */
@Data
public class TimelinePost {

    private Integer id;

    private String title;

    private String description;

    private String postType;

    private Date createTime;

}
