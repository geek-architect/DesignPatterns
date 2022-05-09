package com.geekarchitect.patterns.demo0304;

import com.geekarchitect.patterns.demo0301.Area;
import com.geekarchitect.patterns.demo0301.IMobileInfo;
import com.geekarchitect.patterns.demo0301.TestBase;
import com.geekarchitect.patterns.demo0303.MobileInfoV2;

import java.util.Date;
import java.util.Random;

/**
 * 第四版代码：基于享元模式+guava cache 测试类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
public class TestMobilePoolV4 extends TestBase {

    public TestMobilePoolV4() {
    }

    public static void main(String[] args) {
        int maxNumber = 10000;
        if (null != args && args.length > 0) {
            maxNumber = Integer.parseInt(args[0]);
        }
        //maxNumber=0;
        TestMobilePoolV4 testMobilePool = new TestMobilePoolV4();
        testMobilePool.loadMobile(maxNumber);
    }

    public IMobileInfo generateMobile(Long id, String mobile) {
        //初始化省份及城市信息
        Area area = arrayList.get(new Random().nextInt(arrayList.size()));
        area = FlyweightFactoryV2.getInstance().getArea(area);
        IMobileInfo mobileInfo = new MobileInfoV2(area.getCityCode());
        mobileInfo.setId(id);
        mobileInfo.setMobile(mobile);
        mobileInfo.setAddDate(new Date());
        return mobileInfo;
    }

    @Override
    public String getVersion() {
        return "第四版代码：基于享元模式+guava cache";
    }

}
