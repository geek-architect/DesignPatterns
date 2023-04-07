package com.geekarchitect.patterns.bridge.demo02;

/**
 * 多维度角色接口
 */
public interface IMutiDimensional {
    void service();
    void setSingleDimensionalA(ISingleDimensionalA singleDimensionalA);
}
