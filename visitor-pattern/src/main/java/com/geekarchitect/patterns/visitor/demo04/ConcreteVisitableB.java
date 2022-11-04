package com.geekarchitect.patterns.visitor.demo04;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public class ConcreteVisitableB implements IVisitable {

    @Override
    public String getVisitableInfo() {
        return "ConcreteVisitableB";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
