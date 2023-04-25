package com.geekarchitect.patterns.decorator.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractDecorator implements IOriginal{
    private static final Logger LOG = LoggerFactory.getLogger(AbstractDecorator.class);
    private IOriginal original;

    public AbstractDecorator(IOriginal original) {
        this.original = original;
    }

    @Override
    public void service() {
        LOG.info("装饰器默认操作");
       original.service();
    }
}
