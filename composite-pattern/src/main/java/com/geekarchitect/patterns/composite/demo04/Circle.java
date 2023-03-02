package com.geekarchitect.patterns.composite.demo04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/10
 */
public class Circle extends AbstractShape {
    private static final Logger LOG = LoggerFactory.getLogger(Circle.class);

    public Circle(String name) {
        super(name);
    }

    @Override
    public void doDraw(String color) {
        LOG.info("用{}颜色画{}", color, name);
    }
}
