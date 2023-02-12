package com.geekarchitect.patterns.composite.demo01;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/8
 */
public interface IBranchCategory {
    int getId();

    String getName();

    void add(IBranchCategory branchCategory);

    void add(ILeafCategory leafCategory);

    List getSubCategories();

    String getDetails();
}
