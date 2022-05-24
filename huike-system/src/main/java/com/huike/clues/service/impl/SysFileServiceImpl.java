package com.huike.clues.service.impl;

import com.huike.clues.service.ISysFileService;
import com.huike.common.config.MinioConfig;
import com.huike.common.core.domain.AjaxResult;
import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
@Slf4j
public class SysFileServiceImpl implements ISysFileService {

    @Autowired
    private MinioConfig minioConfig;

    /**
     * 文件上传至Minio
     */
    @Override
    public AjaxResult upload(MultipartFile file) throws Exception {

        //创建Minio的连接对象
        MinioClient minioClient = MinioClient.builder()
                .endpoint(minioConfig.getEndpoint() + ":" + minioConfig.getPort())
                .credentials(minioConfig.getAccessKey(), minioConfig.getSecretKey())
                .build();

        //判断文件存储的桶是否存在

        //操作文件，文件上传

        //封装访问的url给前端
        return null;
    }

}
