package com.geekarchitect.patterns.visitor.demo04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public class ConcreteVisitorB implements IVisitor {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteVisitorB.class);

    @Override
    public void visit(ConcreteVisitableA concreteVisitableA) {
        LOG.info("访问方式：ConcreteVisitorB 被访问者：{}", concreteVisitableA.getVisitableInfo());
    }

    @Override
    public void visit(ConcreteVisitableB concreteVisitableB) {
        LOG.info("访问方式：ConcreteVisitorB 被访问者：{}", concreteVisitableB.getVisitableInfo());
    }
}
