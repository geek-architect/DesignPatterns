package com.geekarchitect.patterns.demo0304;

import com.geekarchitect.patterns.demo0301.AreaJson;
import com.geekarchitect.patterns.demo0301.IMobileInfo;
import com.geekarchitect.patterns.demo0301.TestBase;

import java.util.Date;

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

    @Override
    public IMobileInfo generateMobile(Long id, String mobile) {
        //初始化省份及城市信息
        IMobileInfo mobileInfo = new MobileInfoV3(AreaJson.randomArea().getCityCode());
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
