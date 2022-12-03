package com.geekarchitect.patterns.mediator.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(IMediator m) {
        super(m);
        m.addColleague(this);
    }

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteColleagueB.class);

    @Override
    public void receive(String message) {
        LOG.info("ConcreteColleagueB: message={}", message);
    }
}
