package com.geekarchitect.patterns.iterator.guava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class IterablesDemoTest  {
    private static final Logger LOG = LoggerFactory.getLogger(IterablesDemoTest.class);
    private IterablesDemo iterablesDemo;

    @BeforeEach
    void setUp() {
        iterablesDemo=new IterablesDemo();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void concat() {
        LOG.info("concat demo");
        iterablesDemo.concat();
    }
    @Test
    void partition() {
        LOG.info("partition demo");
        iterablesDemo.partition();
    }
}