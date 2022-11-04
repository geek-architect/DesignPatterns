package com.geekarchitect.patterns.visitor.demo04;

import com.geekarchitect.patterns.visitor.demo01.AbstractCloudFileServiceTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class VisitableObjectStructureTest extends AbstractCloudFileServiceTest {
    private static final Logger LOG = LoggerFactory.getLogger(VisitableObjectStructureTest.class);
    private VisitableObjectStructure visitableObjectStructure;
    @BeforeEach
    void setUp() {
        visitableObjectStructure=new VisitableObjectStructure();
        ConcreteVisitableA concreteVisitableA=new ConcreteVisitableA();
        ConcreteVisitableB concreteVisitableB=new ConcreteVisitableB();
        visitableObjectStructure.addItem(concreteVisitableA);
        visitableObjectStructure.addItem(concreteVisitableB);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void service(){
       LOG.info("访问者模式通用代码-传统方式");
       IVisitor visitor=new ConcreteVisitorA();
       visitableObjectStructure.service(visitor);
       visitor=new ConcreteVisitorB();
       visitableObjectStructure.service(visitor);
    }
}