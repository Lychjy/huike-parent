package com.huike.clues.service;

import com.huike.common.core.domain.AjaxResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ISysFileService {

    /**
     * 文件上传
     *
     * @param file
     * @return
     */
    AjaxResult upload(MultipartFile file) throws IOException;

}
