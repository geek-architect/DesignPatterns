package com.geekarchitect.patterns.factorymethod.demo02;

/**
 * 抽象工厂：抽象类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/22
 */
public abstract class AbstractFactory implements IFactory {
    /**
     * 钩子方法，提供默认实现。
     *
     * @return
     */
    @Override
    public IProductA createProductA() {
        return null;
    }

    /**
     * 模板方法,依赖其他的工厂方法，相当于工厂模式里面的客户方角色
     */
    @Override
    public final void templateMethod() {
        createProductA();
        createProductB();

    }
}
