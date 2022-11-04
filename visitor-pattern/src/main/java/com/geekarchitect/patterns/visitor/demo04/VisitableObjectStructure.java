package com.geekarchitect.patterns.visitor.demo04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public class VisitableObjectStructure {
    public List<IVisitable> visitableList = new ArrayList<>();

    public void addItem(IVisitable visitable) {
        visitableList.add(visitable);
    }

    public void service(IVisitor visitor) {
        visitableList.forEach(item -> item.accept(visitor));
    }
}
