package com.geekarchitect.patterns.composite.demo02;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/8
 */
public class GoodsLeafCategoryV2 implements ILeafCategoryV2 {

    private final int id;
    private final String name;

    public GoodsLeafCategoryV2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(ICategory category) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List getSubCategories() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getDetails() {
        return "叶子分类：id=" + this.id + " name=" + this.name + "\n";
    }

}
