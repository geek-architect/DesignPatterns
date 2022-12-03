package com.geekarchitect.patterns.mediator.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(IMediator m) {
        super(m);
        m.addColleague(this);
    }

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteColleagueA.class);

    @Override
    public void receive(String message) {
        LOG.info("ConcreteColleagueA: message={}", message);
    }
}
