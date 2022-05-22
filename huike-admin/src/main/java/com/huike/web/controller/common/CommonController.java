package com.huike.web.controller.common;

import com.huike.clues.service.ISysFileService;
import com.huike.common.core.controller.BaseController;
import com.huike.common.core.domain.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 通用请求处理
 */
@RestController
public class CommonController extends BaseController {

    @Autowired
    private ISysFileService fileService;

    /**
     * 通用上传请求
     */
    @PostMapping("/common/upload")
    public AjaxResult uploadFile(MultipartFile file) throws IOException {
        // 上传文件路径
        return fileService.upload(file);
    }
}