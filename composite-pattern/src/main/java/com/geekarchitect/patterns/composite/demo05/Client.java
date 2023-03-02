package com.geekarchitect.patterns.composite.demo05;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/2
 */
public class Client {
    public void service(IUnifiedObject unifiedObject) {
        unifiedObject.doService();
    }
}
