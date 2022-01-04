package cn.dblearn.blog.common.fill;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author fubibo
 * @create 2021/10/19 9:38
 */

/**
 * Mybatis Plus 自动填充
 */

@Component
public class MybatisPlusAutoFillHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        // 填充创建时间 更新时间字段
        Date now = new Date();
        this.setFieldValByName("createTime", now, metaObject);
        this.setFieldValByName("updateTime", now, metaObject);
    }


    @Override
    public void updateFill(MetaObject metaObject) {
        // 填充给更新时间字段
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
