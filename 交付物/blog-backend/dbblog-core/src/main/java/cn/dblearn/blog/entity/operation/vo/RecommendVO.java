package cn.dblearn.blog.entity.operation.vo;

import cn.dblearn.blog.entity.operation.Recommend;
import cn.dblearn.blog.entity.operation.Tag;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author fubibo
 * @create 2021/11/05 13:56
 */

@Data
public class RecommendVO extends Recommend {

    private String description;

    private Long readNum;

    private Long commentNum;

    private Long likeNum;

    private String urlType;

    private String cover;

    private Date createTime;

    private List<Tag> tagList;

}
