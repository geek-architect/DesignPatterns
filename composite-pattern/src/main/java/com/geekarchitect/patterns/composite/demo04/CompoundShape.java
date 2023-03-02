package com.geekarchitect.patterns.composite.demo04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/10
 */
public class CompoundShape implements IShape {
    //collection of Shapes
    private final List<IShape> shapes = new ArrayList<IShape>();

    @Override
    public void draw(String color) {
        for (IShape sh : shapes) {
            sh.draw(color);
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
