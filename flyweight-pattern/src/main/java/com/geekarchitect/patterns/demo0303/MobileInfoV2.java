package com.geekarchitect.patterns.demo0303;

import com.geekarchitect.patterns.demo0301.IMobileInfo;
import com.geekarchitect.patterns.demo0302.FlyweightFactory;
import lombok.Data;

import java.util.Date;

/**
 * 手机号详细信息
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
@Data
public class MobileInfoV2 implements IMobileInfo {
    /**
     * 编号
     */
    private Long id;
    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 城市编号
     */
    private Long cityCode;
    /**
     * 添加日期
     */
    private Date addDate;

    public MobileInfoV2(long cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public Long getProvinceCode() {
        return FlyweightFactory.getInstance().getArea(cityCode).getProvinceCode();
    }

    @Override
    public void setProvinceCode(Long provinceCode) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getProvinceName() {
        return FlyweightFactory.getInstance().getArea(cityCode).getProvinceName();
    }

    @Override
    public void setProvinceName(String provinceName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Long getProvinceId() {
        return FlyweightFactory.getInstance().getArea(cityCode).getProvinceId();
    }

    @Override
    public void setProvinceId(Long provinceId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Long getCityCode() {
        return FlyweightFactory.getInstance().getArea(cityCode).getCityCode();
    }

    @Override
    public String getCityName() {
        return FlyweightFactory.getInstance().getArea(cityCode).getCityName();
    }

    @Override
    public void setCityName(String cityName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Long getCityId() {
        return FlyweightFactory.getInstance().getArea(cityCode).getCityId();
    }

    @Override
    public void setCityId(Long cityId) {
        throw new UnsupportedOperationException();
    }
}
