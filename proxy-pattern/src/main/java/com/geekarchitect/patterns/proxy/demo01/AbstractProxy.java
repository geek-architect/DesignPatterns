package com.geekarchitect.patterns.proxy.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractProxy implements IOriginal{
    private static final Logger LOG = LoggerFactory.getLogger(AbstractProxy.class);
    private IOriginal original;

    public AbstractProxy(IOriginal original) {
        this.original = original;
    }

    @Override
    public void service() {
       LOG.info("代理类默认操作");
       original.service();
    }
}
