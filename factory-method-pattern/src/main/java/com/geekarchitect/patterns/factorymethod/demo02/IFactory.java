package com.geekarchitect.patterns.factorymethod.demo02;

/**
 * 抽象工厂：接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public interface IFactory {
    /**
     * 工厂方法
     *
     * @return
     */
    IProductA createProductA();

    /**
     * 工厂方法
     *
     * @return
     */
    IProductB createProductB();

    /**
     * 模板方法
     */
    void templateMethod();
}
