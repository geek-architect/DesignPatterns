package com.geekarchitect.patterns.composite.demo05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private Client client;

    @BeforeEach
    void setUp() {
        client=new Client();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void service() {
        CompositeObject compositeObject=new CompositeObject("组合对象1");

        IndividualObject individualObject1=new IndividualObject("单体对象1");
        IndividualObject individualObject2=new IndividualObject("单体对象2");
        CompositeObject compositeObject11=new CompositeObject("组合对象11");

        IndividualObject individualObject11=new IndividualObject("单体对象11");
        IndividualObject individualObject12=new IndividualObject("单体对象12");

        compositeObject.addChild(individualObject1);
        compositeObject.addChild(individualObject2);
        compositeObject.addChild(compositeObject11);

        compositeObject11.addChild(individualObject11);
        compositeObject11.addChild(individualObject12);


        client.service(compositeObject);
    }
}