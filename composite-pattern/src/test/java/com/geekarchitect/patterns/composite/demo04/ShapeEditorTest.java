package com.geekarchitect.patterns.composite.demo04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ShapeEditorTest {
    private static final Logger LOG = LoggerFactory.getLogger(ShapeEditorTest.class);
    private ShapeEditor shapeEditor;

    @BeforeEach
    void setUp() {
        shapeEditor=new ShapeEditor();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void draw() {
        LOG.info("图形编辑器：基于组合模式");
        IShape cir = new Circle("圆");
        IShape line = new Line("线");

        CompoundShape compoundShape = new CompoundShape("组合图形");
        compoundShape.add(cir);
        compoundShape.add(line);

        shapeEditor.draw(cir,"红色");
        shapeEditor.draw(compoundShape,"蓝色");

    }
}