package com.geekarchitect.patterns.singleton.demo04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/9
 */
public class TestJDK {
    private static final Logger LOG = LoggerFactory.getLogger(TestJDK.class);

    public static void main(String[] args) {
        TestJDK testJDK = new TestJDK();
        testJDK.demo01();
    }

    public void demo01() {
        Runtime runtime = Runtime.getRuntime();
        LOG.info("maxMemory={},totalMemory={},freeMemory={}",
                runtime.maxMemory(),
                runtime.totalMemory(),
                runtime.freeMemory());
    }
}
