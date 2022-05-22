package com.huike.clues.utils.easyExcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.huike.clues.domain.dto.ImportResultDTO;
import com.huike.clues.domain.vo.TbClueExcelVo;
import com.huike.clues.service.ITbClueService;

/**
 * EasyExcel监听器，用于解析数据并执行操作
 */
public class ExcelListener extends AnalysisEventListener<TbClueExcelVo> {

    public ITbClueService clueService;
    private final ImportResultDTO resultDTO = new ImportResultDTO();

    /**
     * 提供带参构造方法，在这里需要通过构造方法的方式获取对应的service层
     * 谁调用这个监听器谁提供需要的service
     */
    public ExcelListener(ITbClueService clueService) {
        this.clueService = clueService;
    }

    /**
     * 每解析一行数据都要执行一次
     * 每条都执行一次插入操作
     */
    @Override
    public void invoke(TbClueExcelVo data, AnalysisContext context) {
        //1. 调用添加线索的业务逻辑
        ImportResultDTO addResult = clueService.importCluesData(data);
        //2. 统计的处理结果（成功，失败多少条，用于前端页面的提示）
        resultDTO.addAll(addResult);
    }

    /**
     * 当所有数据都解析完成后会执行
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
    }

    /**
     * 返回结果集对象
     */
    public ImportResultDTO getResult() {
        return resultDTO;
    }

}