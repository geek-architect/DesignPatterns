package com.geekarchitect.patterns.observer.demo04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ConcreteObservableTest {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteObservableTest.class);
    private IObservable observable;
    @BeforeEach
    void setUp() {
        observable=new ConcreteObservableA();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void notifyObservers() {
        LOG.info("观察者模式通用代码");
        IObserver observerA=new ConcreteObserverA();
        IObserver observerB=new ConcreteObserverB();
        observable.add(observerA);
        observable.add(observerB);
        observable.service();
    }
}