package com.huike.report.domain.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LineSeriesVO {

    private String name;
    private List<Object> data = new ArrayList<>();

}
