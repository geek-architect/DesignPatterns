package com.geekarchitect.patterns.adapter.demo01;

/**
 * 对象适配器
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/16
 */
public class AdapterA implements ITarget {
    private final IAdaptee adaptee;

    public AdapterA(IAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void service() {
        adaptee.doService();
    }
}
