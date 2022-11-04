package com.geekarchitect.patterns.visitor.demo05;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/3
 */
public abstract class AbstractVisitorV2 implements IVisitorV2 {
    @Override
    public final void visit(IVisitableV2 visitableV2) {
        if (visitableV2 instanceof ConcreteVisitableAV2) {
            visit((ConcreteVisitableAV2) visitableV2);
        } else if (visitableV2 instanceof ConcreteVisitableBV2) {
            visit((ConcreteVisitableBV2) visitableV2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    protected abstract void visit(ConcreteVisitableAV2 concreteVisitableAV2);

    protected abstract void visit(ConcreteVisitableBV2 concreteVisitableBV2);
}
