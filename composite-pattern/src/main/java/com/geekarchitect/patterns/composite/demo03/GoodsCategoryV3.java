package com.geekarchitect.patterns.composite.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/9
 */
public class GoodsCategoryV3 implements ICategoryV3 {
    private final List<ICategoryV3> subCategories = new ArrayList();
    private final int id;
    private final String name;

    public GoodsCategoryV3(int ID, String name) {
        this.id = ID;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(ICategoryV3 category) {
        this.subCategories.add(category);
    }


    @Override
    public List getSubCategories() {
        return this.subCategories;
    }

    @Override
    public String getDetails() {
        StringBuffer details = new StringBuffer();
        details.append("分支分类：ID=").append(this.id).append(" name=").append(this.name).append("\n");
        for (ICategoryV3 sub : this.subCategories) {
            details.append("\t").append((sub).getDetails());
        }
        return details.toString();
    }
}
