package com.geekarchitect.patterns.cor.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {

    private Sender sender;

    @BeforeEach
    void setUp() {
        sender=new Sender();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void service() {
        sender.service();
    }
}