package cn.dblearn.blog.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * 对象存储设置
 * @author fubibo
 * @create 2021/10/19 9:35
 */

@Data
@Configuration
public class CloudStorageConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    @Value("${oss.qiniu.domain}")
    private String qiniuDomain;


    @Value("${oss.qiniu.prefix}")
    private String qiniuPrefix;


    @Value("${oss.qiniu.accessKey}")
    private String qiniuAccessKey;


    @Value("${oss.qiniu.secretKey}")
    private String qiniuSecretKey;


    @Value("${oss.qiniu.bucketName}")
    private String qiniuBucketName;
}
