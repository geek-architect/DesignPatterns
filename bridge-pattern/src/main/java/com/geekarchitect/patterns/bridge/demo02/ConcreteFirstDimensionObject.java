package com.geekarchitect.patterns.bridge.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 第一维对象对象具体类
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public class ConcreteFirstDimensionObject extends AbstractFirstDimensionObject {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteFirstDimensionObject.class);

    public ConcreteFirstDimensionObject(IOtherDimensionObject otherDimensionObject) {
        super(otherDimensionObject);
    }

    public void refinedService() {
        //扩展代码
        otherDimensionObject.doService();
    }
}
