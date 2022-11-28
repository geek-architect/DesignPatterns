package com.geekarchitect.patterns.observer.demo04;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/23
 */
public class ConcreteObservableA extends AbstractObservable {
    @Override
    public void service() {
        Message message = new Message();
        this.notifyObservers(message);
    }
}
