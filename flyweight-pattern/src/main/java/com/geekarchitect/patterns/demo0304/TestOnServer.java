package com.geekarchitect.patterns.demo0304;

import com.geekarchitect.patterns.demo0301.TestMobilePool;
import com.geekarchitect.patterns.demo0302.TestMobilePoolV2;
import com.geekarchitect.patterns.demo0303.TestMobilePoolV3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试类：运行在阿里云服务器
 * @author 极客架构师@吴念
 * @createTime 2022/5/9
 */
public class TestOnServer {
    private static final Logger LOG = LoggerFactory.getLogger(TestOnServer.class);
    public static void main(String[] args) {
        int maxNumber = 10000;
        if (null != args && args.length > 0) {
            maxNumber = Integer.parseInt(args[0]);
        }
        String demoNumber = "0304";
        if (null != args && args.length > 1) {
            demoNumber = args[1];
        }
        LOG.info("参数：maxNumber={} , demoNumber={}",maxNumber,demoNumber);
        switch (demoNumber) {
            case "0301":
                TestMobilePool testMobilePool = new TestMobilePool();
                testMobilePool.loadMobile(maxNumber);
                break;
            case "0302":
                TestMobilePoolV2 testMobilePoolV2 = new TestMobilePoolV2();
                testMobilePoolV2.loadMobile(maxNumber);
                break;
            case "0303":
                TestMobilePoolV3 testMobilePoolV3 = new TestMobilePoolV3();
                testMobilePoolV3.loadMobile(maxNumber);
                break;
            case "0304":
                TestMobilePoolV4 testMobilePoolV4 = new TestMobilePoolV4();
                testMobilePoolV4.loadMobile(maxNumber);
                break;
        }

    }
}
