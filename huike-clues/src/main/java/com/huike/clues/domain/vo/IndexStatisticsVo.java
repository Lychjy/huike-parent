package com.huike.clues.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndexStatisticsVo {

    private String beginCreateTime;
    private String endCreateTime;
    private Long deptId;
    private Long[] deptIds;

}
