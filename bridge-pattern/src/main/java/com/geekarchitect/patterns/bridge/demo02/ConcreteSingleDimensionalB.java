package com.geekarchitect.patterns.bridge.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 其他维度对象具体类
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public class ConcreteSingleDimensionalB implements ISingleDimensionalA {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteSingleDimensionalB.class);

    @Override
    public void doService() {
        LOG.info("ConcreteOtherDimensionObjectB doServiceBySecondDimension()");
    }
}
