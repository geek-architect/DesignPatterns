package com.geekarchitect.patterns.demo0306;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Integer 测试类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/18
 */
public class TestInteger {
    private static final Logger LOG = LoggerFactory.getLogger(TestInteger.class);

    public static void main(String[] args) {
        TestInteger testInteger = new TestInteger();
        testInteger.demo1();
        testInteger.demo2();
    }

    public void demo1() {
        Integer quantityOfComputerIBM = 10; //自动装箱
        //Integer quantityOfComputerIBM = Integer.valueOf(10); 手动装箱
        Integer quantityOfComputerHuawei = 10;

        Integer quantityOfMouseIBM = 100;
        Integer quantityOfMouseHuawei = 100;

        Integer quantityOfKeyboardIBM = 1000;
        Integer quantityOfKeyboardHuawei = 1000;
        LOG.info("方式1：直接赋值");
        LOG.info("quantityOfComputerIBM == quantityOfComputerHuawei is {}", (quantityOfComputerIBM == quantityOfComputerHuawei));
        LOG.info("quantityOfMouseIBM == quantityOfMouseHuawei is {}", (quantityOfMouseIBM == quantityOfMouseHuawei));
        LOG.info("quantityOfKeyboardIBM == quantityOfKeyboardHuawei is {}", (quantityOfKeyboardIBM == quantityOfKeyboardHuawei));
    }

    public void demo2() {
        Integer quantityOfComputerIBM = new Integer(10);
        Integer quantityOfComputerHuawei = new Integer(10);

        Integer quantityOfMouseIBM = new Integer(100);
        Integer quantityOfMouseHuawei = new Integer(100);

        Integer quantityOfKeyboardIBM = new Integer(100);
        Integer quantityOfKeyboardHuawei = new Integer(1000);
        LOG.info("方式2：new方式");
        LOG.info("quantityOfComputerIBM == quantityOfComputerHuawei is {}", (quantityOfComputerIBM == quantityOfComputerHuawei));
        LOG.info("quantityOfMouseIBM == quantityOfMouseHuawei is {}", (quantityOfMouseIBM == quantityOfMouseHuawei));
        LOG.info("quantityOfKeyboardIBM == quantityOfKeyboardHuawei is {}", (quantityOfKeyboardIBM == quantityOfKeyboardHuawei));
    }
}
