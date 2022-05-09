package com.geekarchitect.patterns.demo0301;

import java.util.Date;

/**
 * 手机号详细信息接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/3
 */
public interface IMobileInfo {
    Long getId();

    void setId(Long id);

    String getMobile();

    void setMobile(String mobile);

    Long getProvinceCode();

    void setProvinceCode(Long provinceCode);

    String getProvinceName();

    void setProvinceName(String provinceName);

    Long getProvinceId();

    void setProvinceId(Long provinceId);

    Long getCityCode();

    void setCityCode(Long cityCode);

    String getCityName();

    void setCityName(String cityName);

    Long getCityId();

    void setCityId(Long cityId);

    Date getAddDate();

    void setAddDate(Date addDate);
}
