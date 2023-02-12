package com.geekarchitect.patterns.composite.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/8
 */
public class GoodsLeafCategory implements ILeafCategory {

    private final int id;
    private final String name;

    public GoodsLeafCategory(int id, String name) {
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
    public String getDetails() {
        return "叶子分类：id=" + this.id + " name=" + this.name + "\n";
    }

}
