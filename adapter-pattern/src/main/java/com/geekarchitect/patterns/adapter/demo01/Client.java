package com.geekarchitect.patterns.adapter.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/16
 */
public class Client {
    public void service(ITarget target) {
        target.service();
    }

}
