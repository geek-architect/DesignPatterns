package com.geekarchitect.patterns.observer.demo04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/23
 */
public abstract class AbstractObservable implements IObservable {
    private final List<IObserver> observerList = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        observerList.stream().forEach(o -> o.update(message));
    }
}
