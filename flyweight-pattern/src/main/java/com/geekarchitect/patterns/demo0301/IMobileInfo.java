package com.geekarchitect.patterns.demo0301;

import java.util.Date;

/**
 * 手机号详细信息接口
 * @author 极客架构师@吴念
 * @createTime 2022/5/3
 */
public interface IMobileInfo {
    long getId();

    void setId(long id);

    String getMobile();

    void setMobile(String mobile);

    long getProvinceCode();

    void setProvinceCode(long provinceCode);

    String getProvinceName();

    void setProvinceName(String provinceName);

    long getProvinceId();

    void setProvinceId(long provinceId);

    long getCityCode();

    void setCityCode(long cityCode);

    String getCityName();

    void setCityName(String cityName);

    long getCityId();

    void setCityId(long cityId);

    Date getAddDate();

    void setAddDate(Date addDate);
}
