package com.geekarchitect.patterns.composite.demo04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CompoundShapeTest {
    private static final Logger LOG = LoggerFactory.getLogger(CompoundShapeTest.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void draw() {
        LOG.info("图形编辑：基于组合模式");
        IShape tri = new Triangle();
        IShape cir = new Circle();
        IShape line = new Line();

        CompoundShape compoundShape = new CompoundShape();
        compoundShape.add(tri);
        compoundShape.add(cir);

        compoundShape.draw("黑色");
        compoundShape.clear();

        compoundShape.add(tri);
        compoundShape.add(cir);
        compoundShape.add(line);
        compoundShape.draw("黄色");
    }
}