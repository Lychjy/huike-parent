package com.huike.clues.service.impl;


import com.huike.clues.domain.TbClue;
import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.clues.mapper.TbClueMapper;
import com.huike.clues.mapper.TbClueTrackRecordMapper;
import com.huike.clues.service.ITbClueTrackRecordService;
import com.huike.common.utils.DateUtils;
import com.huike.common.utils.SecurityUtils;
import com.huike.common.utils.bean.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 线索跟进记录Service业务层处理
 */
@Service
public class TbClueTrackRecordServiceImpl implements ITbClueTrackRecordService {

    @Autowired
    private TbClueMapper clueMapper;
    @Autowired
    private TbClueTrackRecordMapper recordMapper;


}
