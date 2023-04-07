package com.geekarchitect.patterns.bridge.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 第一维对象对象具体类
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public class ConcreteMultiDimensionalB extends AbstractMultiDimensional {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteMultiDimensionalB.class);

    public ConcreteMultiDimensionalB(ISingleDimensionalA otherDimensionObject) {
        super(otherDimensionObject);
    }

    public void refinedService() {
        //扩展代码
        LOG.info("ConcreteMultiDimensionalB refinedService()");
    }
}
