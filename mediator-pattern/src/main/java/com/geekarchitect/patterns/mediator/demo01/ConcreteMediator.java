package com.geekarchitect.patterns.mediator.demo01;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements IMediator {
    private List<IColleague> colleagueList = new ArrayList<>();

    @Override
    public void send(String message, IColleague colleague) {
        for (IColleague item : colleagueList) {
            if (item != colleague) {
                item.receive(message);
            }
        }
    }

    @Override
    public void addColleague(IColleague iColleague) {
        this.colleagueList.add(iColleague);
    }
}
