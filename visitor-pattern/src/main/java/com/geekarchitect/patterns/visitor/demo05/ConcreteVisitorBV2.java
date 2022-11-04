package com.geekarchitect.patterns.visitor.demo05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public class ConcreteVisitorBV2 extends AbstractVisitorV2 {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteVisitorBV2.class);

    @Override
    public void visit(ConcreteVisitableAV2 concreteVisitableA) {
        LOG.info("访问方式：ConcreteVisitorBV2 被访问者：{}", concreteVisitableA.getVisitableInfo());
    }

    @Override
    public void visit(ConcreteVisitableBV2 concreteVisitableB) {
        LOG.info("访问方式：ConcreteVisitorBV2 被访问者：{}", concreteVisitableB.getVisitableInfo());
    }
}
