package com.geekarchitect.patterns.bridge.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 第一维对象对象具体类
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public class ConcreteMultiDimensionalA extends AbstractMultiDimensional {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteMultiDimensionalA.class);

    public ConcreteMultiDimensionalA(ISingleDimensionalA otherDimensionObject) {
        super(otherDimensionObject);
    }

    @Override
    public void service() {
        LOG.info("ConcreteMultiDimensionalA: service()");
        //扩展代码
        super.service();
    }
}
