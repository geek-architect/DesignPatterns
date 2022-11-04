package com.geekarchitect.patterns.visitor.demo05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public class VisitableObjectStructureV2 {
    public List<IVisitableV2> visitableList = new ArrayList<>();

    public void addItem(IVisitableV2 visitable) {
        visitableList.add(visitable);
    }

    public void service(IVisitorV2 visitor) {
        visitableList.forEach(item -> visitor.visit(item));
    }
}
