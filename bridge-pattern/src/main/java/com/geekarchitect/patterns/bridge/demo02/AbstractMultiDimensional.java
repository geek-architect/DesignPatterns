package com.geekarchitect.patterns.bridge.demo02;

import com.geekarchitect.patterns.bridge.demo01.ConcreteImplementorA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 多维度角色抽象类
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public abstract class AbstractMultiDimensional implements IMutiDimensional{
    private static final Logger LOG = LoggerFactory.getLogger(AbstractMultiDimensional.class);
    /**
     * 桥接角色
     */
    protected ISingleDimensionalA singleDimensionalA;

    public AbstractMultiDimensional(ISingleDimensionalA singleDimensionalA) {
        this.singleDimensionalA = singleDimensionalA;
    }
    @Override
    public void setSingleDimensionalA(ISingleDimensionalA singleDimensionalA) {
        this.singleDimensionalA = singleDimensionalA;
    }
    @Override
    public void service() {
        LOG.info("AbstractMultiDimensional: service()");
        singleDimensionalA.doService();
    }
}
