package com.geekarchitect.patterns.demo0302;

import com.geekarchitect.patterns.demo0301.MobileInfo;

/**
 * 手机详细信息代理类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/3
 */
public class MobileInfoProxy extends MobileInfo {
    private final long cityCode;

    public MobileInfoProxy(long cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public long getProvinceCode() {
        return FlyweightFactory.getInstance().getCity(cityCode).getProvinceCode();
    }

    @Override
    public String getProvinceName() {
        return FlyweightFactory.getInstance().getCity(cityCode).getProvinceName();
    }

    @Override
    public long getProvinceId() {
        return FlyweightFactory.getInstance().getCity(cityCode).getProvinceId();
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
    public long getCityId() {
        return FlyweightFactory.getInstance().getCity(cityCode).getCityId();
    }
}
