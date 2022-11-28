package com.geekarchitect.patterns.observer.demo04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/23
 */
public class ConcreteObserverA implements IObserver {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteObserverA.class);

    @Override
    public void update(Message message) {
        LOG.info("Observer：ConcreteObserverA");
    }
}
