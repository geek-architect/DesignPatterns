package com.geekarchitect.patterns.visitor.demo04;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public interface IVisitable {
    String getVisitableInfo();

    void accept(IVisitor visitor);
}
