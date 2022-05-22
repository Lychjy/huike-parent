package com.huike.clues.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import io.minio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.huike.clues.service.ISysFileService;
import com.huike.common.config.MinioConfig;
import com.huike.common.core.domain.AjaxResult;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SysFileServiceImpl implements ISysFileService {

    @Autowired
    private MinioConfig minioConfig;

    /**
     * 文件上传至Minio
     */
    @Override
    public AjaxResult upload(MultipartFile file) throws IOException {
        /**
         * 创建Minio的连接对象
         */
        MinioClient minioClient = MinioClient.builder()
                .endpoint(minioConfig.getEndpoint() + ":" + minioConfig.getPort())
                .credentials(minioConfig.getAccessKey(), minioConfig.getSecretKey())
                .build();

        /**
         * TODO 补全这部分代码
         * 获取桶的名称，基于官网的内容，判断文件存储的桶是否存在 如果桶不存在就创建桶
         */
        String bucketName = minioConfig.getBucketName();


        /**
         * TODO 补全这部分代码
         * 思路：我们上传的文件是[合同.pdf]，那么我们应该上传到配置的bucket内 我们配置的bucketName是：huike
         *      应该按照上传的文件需要按照年月日进行目录区分，并使用UUID解决文件重名问题
         *          举例：2022-05-05日进行上传的
         *          那么存在桶里的路径应该是：[/huike/2022/05/05/uuid.pdf]
         */
        InputStream inputStream = file.getInputStream();


        //返回结果
        return AjaxResult.success();
    }

}
