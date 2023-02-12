package com.geekarchitect.patterns.composite.demo04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/10
 */
public class Line implements IShape {
    private static final Logger LOG = LoggerFactory.getLogger(Line.class);

    @Override
    public void draw(String color) {
        LOG.info("用{}颜色画直线", color);
    }
}
