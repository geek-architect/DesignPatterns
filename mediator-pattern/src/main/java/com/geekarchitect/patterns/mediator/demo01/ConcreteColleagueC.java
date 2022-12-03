package com.geekarchitect.patterns.mediator.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteColleagueC extends Colleague {
    public ConcreteColleagueC(IMediator m) {
        super(m);
        m.addColleague(this);
    }

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteColleagueC.class);

    @Override
    public void receive(String message) {
        LOG.info("ConcreteColleagueC: message={}", message);
    }
}
