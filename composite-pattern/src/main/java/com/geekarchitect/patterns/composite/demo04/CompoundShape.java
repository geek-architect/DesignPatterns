package com.geekarchitect.patterns.composite.demo04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/10
 */
public class CompoundShape extends AbstractShape {
    private static final Logger LOG = LoggerFactory.getLogger(CompoundShape.class);
    //collection of Shapes
    private final List<IShape> shapes = new ArrayList<IShape>();

    public CompoundShape(String name) {
        super(name);
    }

    @Override
    public void doDraw(String color) {
        LOG.info("用{}颜色画{}", color, name);
        for (IShape sh : shapes) {
            sh.doDraw(color);
        }
    }

    public void add(IShape s) {
        this.shapes.add(s);
    }

    public void remove(IShape s) {
        shapes.remove(s);
    }

    public void clear() {
        this.shapes.clear();
    }
}
