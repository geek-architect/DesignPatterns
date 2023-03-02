package com.geekarchitect.patterns.composite.demo05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/2
 */
public class CompositeObject extends AbstractUnifiedObject {
    private static final Logger LOG = LoggerFactory.getLogger(CompositeObject.class);
    private final List<IUnifiedObject> children = new ArrayList<>();

    public CompositeObject(String name) {
        super(name);
    }


    @Override
    public void doService() {
        LOG.info("组合对象：{} 业务方法", name);
        children.forEach(IUnifiedObject::doService);
    }

    public void addChild(IUnifiedObject child) {
        children.add(child);
    }

    public void remove(IUnifiedObject child) {
        children.remove(child);
    }
}
