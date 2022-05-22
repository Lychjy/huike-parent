package com.huike.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Minio相关配置
 */
@Data
@Component
@ConfigurationProperties(prefix = "minio")
public class MinioConfig {

    //ip地址
    private String endpoint;
    //端口号
    private int port;
    //账户名
    private String accessKey;
    //密码
    private String secretKey;
    //默认存储桶
    private String bucketName;
}