package com.geekarchitect.patterns.demo0301;

import lombok.Data;

import java.util.Date;

/**
 * 手机号详细信息
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
@Data
public class MobileInfo implements IMobileInfo {
    /**
     * 编号
     */
    private long id;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 省份编码
     */
    private long provinceCode;
    /**
     * 省份名称
     */
    private String provinceName;
    /**
     * 省份序号
     */
    private long provinceId;

    /**
     * 城市编号
     */
    private long cityCode;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 城市序号（不全局唯一）
     */
    private long cityId;

    /**
     * 添加日期
     */
    private Date addDate;


}
