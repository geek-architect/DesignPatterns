package com.geekarchitect.patterns.demo0302;

import com.geekarchitect.patterns.demo0301.MobileInfo;

/**
 * 手机详细信息代理类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/3
 */
public class MobileInfoProxy extends MobileInfo {
    private final long areaCode;

    public MobileInfoProxy(long areaCode) {
        this.areaCode = areaCode;
    }

    @Override
    public long getProvinceCode() {
        return FlyweightFactory.getInstance().getArea(areaCode).getProvinceCode();
    }

    @Override
    public String getProvinceName() {
        return FlyweightFactory.getInstance().getArea(areaCode).getProvinceName();
    }

    @Override
    public long getProvinceId() {
        return FlyweightFactory.getInstance().getArea(areaCode).getProvinceId();
    }

    @Override
    public long getCityCode() {
        return FlyweightFactory.getInstance().getArea(areaCode).getCityCode();
    }

    @Override
    public String getCityName() {
        return FlyweightFactory.getInstance().getArea(areaCode).getCityName();
    }

    @Override
    public long getCityId() {
        return FlyweightFactory.getInstance().getArea(areaCode).getCityId();
    }
}
