package com.geekarchitect.patterns.bridge.demo02;

import com.geekarchitect.patterns.bridge.demo01.ConcreteImplementorA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 其他维度对象具体类
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public class ConcreteSingleDimensionalA implements ISingleDimensionalA {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteImplementorA.class);

    @Override
    public void doService() {
        LOG.info("ConcreteOtherDimensionObjectA doServiceBySecondDimension()");
    }
}
