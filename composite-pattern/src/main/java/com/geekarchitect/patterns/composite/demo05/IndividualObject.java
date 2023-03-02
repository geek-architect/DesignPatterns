package com.geekarchitect.patterns.composite.demo05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/2
 */
public class IndividualObject extends AbstractUnifiedObject {
    private static final Logger LOG = LoggerFactory.getLogger(IndividualObject.class);

    public IndividualObject(String name) {
        this.setName(name);
    }

    @Override
    public void doService() {
        LOG.info("单体对象：{} 业务方法", getName());
    }
}
