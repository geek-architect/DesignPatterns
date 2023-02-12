package com.geekarchitect.patterns.composite.demo03;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/9
 */
public interface ICategoryV3 {
    int getId();

    String getName();

    void add(ICategoryV3 category);

    List getSubCategories();

    String getDetails();
}
