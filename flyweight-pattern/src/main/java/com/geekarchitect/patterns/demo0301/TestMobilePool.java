package com.geekarchitect.patterns.demo0301;

import java.util.Date;
import java.util.Random;

/**
 * 第一版代码：普通方式 测试类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
public class TestMobilePool extends TestBase {
    public TestMobilePool() {
    }

    public static void main(String[] args) {
        int maxNumber = 10000;
        if (null != args && args.length > 0) {
            maxNumber = Integer.parseInt(args[0]);
        }
        //maxNumber=0;
        TestMobilePool testMobilePool = new TestMobilePool();
        testMobilePool.loadMobile(maxNumber);
    }
    @Override
    public IMobileInfo generateMobile(Long id, String mobile) {
        IMobileInfo mobileInfo = new MobileInfo();
        mobileInfo.setId(id);
        mobileInfo.setMobile(mobile);
        mobileInfo.setAddDate(new Date());
        //初始化省份及城市信息
        Area area = arrayList.get(new Random().nextInt(arrayList.size()));
        mobileInfo.setProvinceId(area.getProvinceId());
        mobileInfo.setProvinceName(area.getProvinceName());
        mobileInfo.setProvinceCode(area.getProvinceCode());

        mobileInfo.setCityId(area.getCityId());
        mobileInfo.setCityCode(area.getCityCode());
        mobileInfo.setCityName(area.getCityName());
        return mobileInfo;
    }

    @Override
    public String getVersion() {
        return "第一版代码：普通方式";
    }
}
