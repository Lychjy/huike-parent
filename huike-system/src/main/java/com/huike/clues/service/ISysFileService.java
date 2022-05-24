package com.huike.clues.service;

import com.huike.common.core.domain.AjaxResult;
import io.minio.errors.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public interface ISysFileService {

    /**
     * 文件上传
     *
     * @param file
     * @return
     */
    AjaxResult upload(MultipartFile file) throws Exception;

}
