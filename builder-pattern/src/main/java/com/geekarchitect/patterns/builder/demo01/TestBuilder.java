package com.geekarchitect.patterns.builder.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/2
 */
public class TestBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(TestBuilder.class);

    public static void main(String[] args) {
        TestBuilder testBuilder = new TestBuilder();
        testBuilder.demo01();
    }

    public void demo01() {
        Client client = new Client();
        client.demo01();
        client.demo02();
    }
}
