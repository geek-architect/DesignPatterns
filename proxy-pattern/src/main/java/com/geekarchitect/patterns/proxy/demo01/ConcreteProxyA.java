package com.geekarchitect.patterns.proxy.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteProxyA extends AbstractProxy {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteProxyA.class);
    public ConcreteProxyA(IOriginal original) {
        super(original);
    }

    /**
     * 代理类增加的服务
     */
    void beforeService(){
       LOG.info("ConcreteDecoratorA beforeService()");
    }
    /**
     * 代理类增加的服务
     */
    void afterService(){
        LOG.info("ConcreteDecoratorA afterService()");
    }

    @Override
    public void service() {
        this.beforeService();
        super.service();
        this.afterService();
    }
}
