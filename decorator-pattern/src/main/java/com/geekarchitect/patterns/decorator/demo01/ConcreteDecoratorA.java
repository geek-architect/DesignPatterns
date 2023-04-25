package com.geekarchitect.patterns.decorator.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteDecoratorA extends AbstractDecorator{
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteDecoratorA.class);
    public ConcreteDecoratorA(IOriginal original) {
        super(original);
    }

    /**
     * 装饰器类增加的服务。
     */
    void addedService(){
       LOG.info("ConcreteDecoratorA addedService");
    }

    @Override
    public void service() {
        super.service();
        this.addedService();
    }
}
