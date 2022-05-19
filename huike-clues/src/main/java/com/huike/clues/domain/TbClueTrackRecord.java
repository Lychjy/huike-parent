package com.huike.clues.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.huike.common.annotation.Excel;
import com.huike.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 线索跟进记录对象 tb_clue_track_record
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbClueTrackRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 任务id
     */
    private Long id;

    /**
     * 线索id
     */
    private Long clueId;

    /**
     * 意向等级
     */
    private String subject;

    /**
     * 跟进记录
     */
    private String record;

    /**
     * 意向等级
     */
    private String level;

    /**
     * 0 正常跟进记录 1 伪线索
     */
    private String type;

    /**
     * 原因
     */
    private String falseReason;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date nextTime;


    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("clueId", getClueId())
                .append("createBy", getCreateBy())
                .append("subject", getSubject())
                .append("record", getRecord())
                .append("level", getLevel())
                .append("createTime", getCreateTime())
                .append("type", getType())
                .append("falseReason", getFalseReason())
                .toString();
    }
}
