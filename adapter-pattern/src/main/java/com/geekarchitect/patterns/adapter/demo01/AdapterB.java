package com.geekarchitect.patterns.adapter.demo01;

/**
 * 对象适配器
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/16
 */
public class AdapterB extends AdapteeA implements ITarget {
    @Override
    public void service() {
        super.doService();
    }
}
