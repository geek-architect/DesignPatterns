package com.geekarchitect.patterns.demo0304;

import com.geekarchitect.patterns.demo0301.IMobileInfo;
import com.geekarchitect.patterns.demo0304.FlyweightFactoryV2;
import lombok.Data;

import java.util.Date;

/**
 * 手机号详细信息第二版
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
@Data
public class MobileInfoV3 implements IMobileInfo {
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

    public MobileInfoV3(long cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public long getProvinceCode() {
        return FlyweightFactoryV2.getInstance().getArea(cityCode).getProvinceCode();
    }

    @Override
    public void setProvinceCode(long provinceCode) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getProvinceName() {
        return FlyweightFactoryV2.getInstance().getArea(cityCode).getProvinceName();
    }

    @Override
    public void setProvinceName(String provinceName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getProvinceId() {
        return FlyweightFactoryV2.getInstance().getArea(cityCode).getProvinceId();
    }

    @Override
    public void setProvinceId(long provinceId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getCityName() {
        return FlyweightFactoryV2.getInstance().getArea(cityCode).getCityName();
    }

    @Override
    public void setCityName(String cityName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getCityId() {
        return FlyweightFactoryV2.getInstance().getArea(cityCode).getCityId();
    }

    @Override
    public void setCityId(long cityId) {
        throw new UnsupportedOperationException();
    }
}
