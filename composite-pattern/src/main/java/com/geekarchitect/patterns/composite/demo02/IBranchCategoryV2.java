package com.geekarchitect.patterns.composite.demo02;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/8
 */
public interface IBranchCategoryV2 extends ICategory {
    void add(ICategory category);

    List getSubCategories();
}
