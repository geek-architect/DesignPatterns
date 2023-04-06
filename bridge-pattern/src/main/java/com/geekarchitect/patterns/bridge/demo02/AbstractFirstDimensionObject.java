package com.geekarchitect.patterns.bridge.demo02;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public abstract class AbstractFirstDimensionObject {
    /**
     * 桥接点
     */
    protected IOtherDimensionObject otherDimensionObject;

    public AbstractFirstDimensionObject(IOtherDimensionObject otherDimensionObject) {
        this.otherDimensionObject = otherDimensionObject;
    }

    public void service() {
        otherDimensionObject.doService();
    }
}
