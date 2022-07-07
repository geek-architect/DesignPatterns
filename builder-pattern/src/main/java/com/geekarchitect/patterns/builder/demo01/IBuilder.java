package com.geekarchitect.patterns.builder.demo01;

/**
 * 抽象工厂
 * @author 极客架构师@吴念
 * @createTime 2022/6/27
 */
public interface IBuilder {
    IBuilder buildPartA();

    IBuilder buildPartB();
}
