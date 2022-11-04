package com.geekarchitect.patterns.visitor.demo04;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public class ConcreteVisitableA implements IVisitable {

    @Override
    public String getVisitableInfo() {
        return "ConcreteVisitableA";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
