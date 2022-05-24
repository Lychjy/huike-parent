package com.huike.web.controller.business;

import com.huike.business.domain.vo.BusinessTrackVo;
import com.huike.business.service.ITbBusinessTrackRecordService;
import com.huike.clues.service.ISysDictDataService;
import com.huike.common.annotation.Log;
import com.huike.common.core.controller.BaseController;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.enums.BusinessType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * 商机跟进记录Controller
 */
@RestController
@RequestMapping("/business/record")
public class TbBusinessTrackRecordController extends BaseController {

    @Autowired
    private ITbBusinessTrackRecordService tbBusinessTrackRecordService;

    /**
     * 新增商机跟进记录
     */
    @PreAuthorize("@ss.hasPermi('business:record:add')")
    @Log(title = "商机跟进记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusinessTrackVo businessTrackVo) {
        return null;
    }

    /**
     * 查询商机跟进记录列表
     */
    @PreAuthorize("@ss.hasPermi('business:record:list')")
    @GetMapping("/list")
    public AjaxResult list(@RequestParam("businessId") Long businessId) {
        return null;
    }
}