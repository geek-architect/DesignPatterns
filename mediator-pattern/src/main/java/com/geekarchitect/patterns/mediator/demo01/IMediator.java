package com.geekarchitect.patterns.mediator.demo01;

public interface IMediator {
    void send(String message, IColleague colleague);

    void addColleague(IColleague iColleague);
}
