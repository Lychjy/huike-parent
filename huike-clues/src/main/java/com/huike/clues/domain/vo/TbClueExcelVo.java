package com.huike.clues.domain.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装Excel的每一行数据对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbClueExcelVo {

    @ExcelProperty(value = "手机号(11位手机号，不可有空格)", index = 0)
    private String phone;

    @ExcelProperty(value = "渠道来源", index = 1)
    private String channel;

    @ExcelProperty(value = "活动编号(来源于活动列表8位字母或数字)", index = 2)
    private String activityCode;

    @ExcelProperty(value = "客户姓名", index = 3)
    private String name;

    @ExcelProperty(value = "意向学科", index = 4)
    private String subject;

    @ExcelProperty(value = "意向级别", index = 5)
    private String level;

    @ExcelProperty(value = "性别", index = 6)
    private String sex;

    @ExcelProperty(value = "年龄", index = 7)
    private Long age;

    @ExcelProperty(value = "微信", index = 8)
    private String weixin;

    @ExcelProperty(value = "QQ", index = 9)
    private String qq;
}
