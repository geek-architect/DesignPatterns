package com.geekarchitect.patterns.abstractfactory.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class FamilyBFactory extends AbstractFactory {
    @Override
    public IProductTypeA createProductTypeA() {
        return new ProductTypeBOfFamilyA();
    }

    @Override
    public IProductTypeB createProductTypeB() {
        return new ProductTypeBOfFamilyB();
    }
}
