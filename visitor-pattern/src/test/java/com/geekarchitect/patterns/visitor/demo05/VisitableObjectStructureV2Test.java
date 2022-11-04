package com.geekarchitect.patterns.visitor.demo05;

import com.geekarchitect.patterns.visitor.demo01.AbstractCloudFileServiceTest;
import com.geekarchitect.patterns.visitor.demo04.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class VisitableObjectStructureV2Test extends AbstractCloudFileServiceTest {
    private static final Logger LOG = LoggerFactory.getLogger(VisitableObjectStructureV2Test.class);
    private VisitableObjectStructureV2 visitableObjectStructureV2;
    @BeforeEach
    void setUp() {
        visitableObjectStructureV2=new VisitableObjectStructureV2();
        ConcreteVisitableAV2 concreteVisitableA=new ConcreteVisitableAV2();
        ConcreteVisitableBV2 concreteVisitableB=new ConcreteVisitableBV2();
        visitableObjectStructureV2.addItem(concreteVisitableA);
        visitableObjectStructureV2.addItem(concreteVisitableB);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void service() {
        LOG.info("访问者模式通用代码-改进版");
        IVisitorV2 visitor=new ConcreteVisitorAV2();
        visitableObjectStructureV2.service(visitor);
        visitor=new ConcreteVisitorBV2();
        visitableObjectStructureV2.service(visitor);
    }
}