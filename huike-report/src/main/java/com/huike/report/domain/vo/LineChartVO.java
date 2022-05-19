package com.huike.report.domain.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 折线图
 */
@Data
public class LineChartVO {

    private List<String> xAxis = new ArrayList<>();
    private List<LineSeriesVO> series = new ArrayList<>();

}

