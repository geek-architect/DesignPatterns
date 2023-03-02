package com.geekarchitect.patterns.composite.demo04;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/2
 */
public class ShapeEditor {
    public void draw(IShape shape, String color) {
        shape.doDraw(color);
    }
}
