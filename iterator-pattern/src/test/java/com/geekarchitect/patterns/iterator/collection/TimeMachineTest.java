package com.geekarchitect.patterns.iterator.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class TimeMachineTest extends BaseTest{

    private TimeMachine timeMachine;

    @BeforeEach
    void setUp() {
        timeMachine=new TimeMachine();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void demo1() {
        Vector<String> geekArchitectProgramVector=mockGeekArchitectProgramVector();
        timeMachine.demo1(geekArchitectProgramVector);
    }
    @Test
    void demo2() {
        List<String> geekArchitectProgramList=mockGeekArchitectProgramList();
        timeMachine.demo2(geekArchitectProgramList);
    }
    @Test
    void demo3() {
        List<String> geekArchitectProgramList=mockGeekArchitectProgramList();
        timeMachine.demo3(geekArchitectProgramList);
    }
    @Test
    void demo4() {
        List<String> geekArchitectProgramList=mockGeekArchitectProgramList();
        timeMachine.demo4(geekArchitectProgramList);
    }
    @Test
    void demo5() {
        List<String> geekArchitectProgramList=mockGeekArchitectProgramList();
        timeMachine.demo5(geekArchitectProgramList);
    }
    @Test
    void demo6() {
        List<String> geekArchitectProgramList=mockGeekArchitectProgramList();
        timeMachine.demo6(geekArchitectProgramList);
    }
    @Test
    void demo7() {
        List<String> geekArchitectProgramList=mockGeekArchitectProgramList();
        timeMachine.demo7(geekArchitectProgramList);
    }
}