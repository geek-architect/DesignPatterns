package com.geekarchitect.patterns.demo0303;

import com.alibaba.fastjson.JSON;
import com.geekarchitect.patterns.demo0301.*;
import com.geekarchitect.patterns.demo0302.FlyweightFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 第二版代码：基于享元模式 测试类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
public class TestMobilePoolV3 extends TestBase {

    public TestMobilePoolV3() {
    }

    public static void main(String[] args) {
        int maxNumber = 10000;
        if (null != args && args.length > 0) {
            maxNumber = Integer.parseInt(args[0]);
        }
        //maxNumber=0;
        TestMobilePoolV3 testMobilePool = new TestMobilePoolV3();
        testMobilePool.loadMobile(maxNumber);
    }

    public IMobileInfo generateMobile(Long id, String mobile) {
        //初始化省份及城市信息
        Area area = arrayList.get(new Random().nextInt(arrayList.size()));
        area = FlyweightFactory.getInstance().getArea(area);
        IMobileInfo mobileInfo = new MobileInfoV2(area.getCityCode());
        mobileInfo.setId(id);
        mobileInfo.setMobile(mobile);
        mobileInfo.setAddDate(new Date());
        return mobileInfo;
    }
    @Override
    public String getVersion() {
        return "第三版代码：基于享元模式+多态";
    }

}
