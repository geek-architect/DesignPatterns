package com.geekarchitect.patterns.observer.demo04;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/23
 */
public interface IObservable {
    void add(IObserver observer);

    void remove(IObserver observer);

    void notifyObservers(Message message);

    void service();
}
