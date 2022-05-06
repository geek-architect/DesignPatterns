package com.geekarchitect.patterns.demo0302;

import com.geekarchitect.patterns.demo0301.IMobileInfo;
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
    private long id;
    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 城市编号
     */
    private long cityCode;
    /**
     * 添加日期
     */
    private Date addDate;

    public MobileInfoV2(long cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public long getProvinceCode() {
        return FlyweightFactory.getInstance().getCity(cityCode).getProvinceCode();
    }

    @Override
    public void setProvinceCode(long provinceCode) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getProvinceName() {
        return FlyweightFactory.getInstance().getCity(cityCode).getProvinceName();
    }

    @Override
    public void setProvinceName(String provinceName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getProvinceId() {
        return FlyweightFactory.getInstance().getCity(cityCode).getProvinceId();
    }

    @Override
    public void setProvinceId(long provinceId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getCityCode() {
        return FlyweightFactory.getInstance().getCity(cityCode).getCityCode();
    }

    @Override
    public String getCityName() {
        return FlyweightFactory.getInstance().getCity(cityCode).getCityName();
    }

    @Override
    public void setCityName(String cityName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getCityId() {
        return FlyweightFactory.getInstance().getCity(cityCode).getCityId();
    }

    @Override
    public void setCityId(long cityId) {
        throw new UnsupportedOperationException();
    }
}
