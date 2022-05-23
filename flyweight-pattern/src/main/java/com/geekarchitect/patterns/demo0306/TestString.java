package com.geekarchitect.patterns.demo0306;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * String 测试类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/18
 */
public class TestString {
    private static final Logger LOG = LoggerFactory.getLogger(TestString.class);

    public static void main(String[] args) {
        TestString testInteger = new TestString();
        testInteger.demo1();
        testInteger.demo2();
    }

    public void demo1() {
        String colorOfComputerIBM = "red";
        String colorOfComputerHuawei = "red";
        LOG.info("方式1：直接赋值");
        LOG.info("colorOfComputerIBM == colorOfComputerHuawei is {}", (colorOfComputerIBM == colorOfComputerHuawei));
    }

    public void demo2() {
        String colorOfComputerIBM = new String("red");
        String colorOfComputerHuawei = new String("red");
        LOG.info("方式2：new方式");
        LOG.info("colorOfComputerIBM == colorOfComputerHuawei is {}", (colorOfComputerIBM == colorOfComputerHuawei));
    }
}
