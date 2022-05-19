package com.huike.clues.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.huike.common.annotation.Excel;
import com.huike.common.core.domain.BaseEntity;

/**
 * 线索池规则对象 tb_rule_pool
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbRulePool extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 线程池规则
     */
    private Long id;

    /**
     * 回收时限
     */
    @Excel(name = "回收时限")
    private Long limitTime;

    /**
     * 回收时限字典
     */
    @Excel(name = "回收时限字典")
    private String limitTimeType;

    /**
     * 警告时间
     */
    @Excel(name = "警告时间")
    private Long warnTime;

    /**
     * 警告时间字典单位类型
     */
    @Excel(name = "警告时间字典单位类型")
    private String warnTimeType;

    /**
     * 重复捞取时间
     */
    @Excel(name = "重复捞取时间")
    private Long repeatGetTime;

    /**
     * 重复捞取时间字典
     */
    @Excel(name = "重复捞取时间字典")
    private String repeatType;

    /**
     * 最大保有量
     */
    @Excel(name = "最大保有量")
    private Long maxNunmber;

    /**
     * 0 线索 1 商机
     */
    @Excel(name = "0 线索 1 商机")
    private String type;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("limitTime", getLimitTime())
                .append("limitTimeType", getLimitTimeType())
                .append("warnTime", getWarnTime())
                .append("warnTimeType", getWarnTimeType())
                .append("repeatGetTime", getRepeatGetTime())
                .append("repeatType", getRepeatType())
                .append("maxNunmber", getMaxNunmber())
                .append("type", getType())
                .toString();
    }

    public enum LimitTimeType {
        /*小时*/
        HOUR("0"),
        /*天*/
        DAY("1"),
        /*周*/
        WEEK("2");

        private String value;

        private LimitTimeType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum RuleType {
        /*小时*/
        CLUES("0"),
        /*天*/
        BUSINESS("1");

        private String value;

        private RuleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
