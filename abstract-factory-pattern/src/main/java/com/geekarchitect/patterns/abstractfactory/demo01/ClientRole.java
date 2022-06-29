package com.geekarchitect.patterns.abstractfactory.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class ClientRole {
    public static void main(String[] args) {

    }

    public void demo01() {
        IFactory factory = new FamilyAFactory();
        IProductTypeA productTypeA = factory.createProductTypeA();
        IProductTypeB productTypeB = factory.createProductTypeB();
        productTypeA.doService();
        productTypeB.doService();
    }
}
