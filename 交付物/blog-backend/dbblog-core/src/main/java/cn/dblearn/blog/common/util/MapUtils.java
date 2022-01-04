package cn.dblearn.blog.common.util;

import java.util.HashMap;

/**
 * @author fubibo
 * @create 2021/11/09 11:25
 */
public class MapUtils extends HashMap<String,Object> {

    @Override
    public MapUtils put(String key, Object value) {
        super.put(key,value);
        return this;
    }
}
