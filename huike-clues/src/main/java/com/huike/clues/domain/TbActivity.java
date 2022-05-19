package com.huike.clues.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.huike.common.annotation.Excel;
import com.huike.common.core.domain.BaseEntity;

/**
 * 活动管理对象 tb_activity
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbActivity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    //编码
    private String code;

    private String name;

    /**
     * 渠道来源
     */
    @Excel(name = "渠道来源")
    private String channel;

    /**
     * 活动简介
     */
    @Excel(name = "活动简介")
    private String info;

    /**
     * 活动类型
     */
    @Excel(name = "活动类型")
    private String type;

    /**
     * 课程折扣
     */
    @Excel(name = "课程折扣")
    private Float discount;

    /**
     * 课程代金券
     */
    @Excel(name = "课程代金券")
    private Integer vouchers;

    /**
     * 状态
     */
    @Excel(name = "状态")
    private String status;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date beginTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date endTime;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("channel", getChannel())
                .append("info", getInfo())
                .append("type", getType())
                .append("discount", getDiscount())
                .append("vouchers", getVouchers())
                .append("status", getStatus())
                .append("beginTime", getBeginTime())
                .append("endTime", getEndTime())
                .append("code", getCode())
                .toString();
    }
}