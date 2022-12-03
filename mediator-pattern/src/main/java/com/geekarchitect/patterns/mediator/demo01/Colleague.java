package com.geekarchitect.patterns.mediator.demo01;

public abstract class Colleague implements IColleague {
    private IMediator mediator;

    public Colleague(IMediator m) {
        mediator = m;
    }

    //send a message via the mediator
    public void send(String message) {
        mediator.send(message, this);
    }

    public abstract void receive(String message);
}
