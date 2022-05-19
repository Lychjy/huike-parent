package com.huike.clues.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.huike.common.annotation.Excel;
import com.huike.common.core.domain.BaseEntity;

/**
 * 课程管理对象 tb_course
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbCourse extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 课程id
     */
    private Long id;

    /**
     * 课程名称
     */
    @Excel(name = "课程名称")
    private String name;

    /**
     * 课程编码
     */
    private String code;

    /**
     * 课程学科
     */
    @Excel(name = "课程学科")
    private String subject;

    /**
     * 价格
     */
    @Excel(name = "价格")
    private Integer price;

    /**
     * 适用人群
     */
    @Excel(name = "适用人群")
    private String applicablePerson;

    /**
     * 课程描述信息
     */
    @Excel(name = "课程描述信息")
    private String info;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("subject", getSubject())
                .append("price", getPrice())
                .append("applicablePerson", getApplicablePerson())
                .append("info", getInfo())
                .append("createTime", getCreateTime())
                .toString();
    }
}