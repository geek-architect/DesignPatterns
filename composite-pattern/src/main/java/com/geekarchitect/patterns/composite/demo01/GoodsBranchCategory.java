package com.geekarchitect.patterns.composite.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/8
 */
public class GoodsBranchCategory implements IBranchCategory {
    private final List subCategories = new ArrayList();
    private final int id;
    private final String name;

    public GoodsBranchCategory(int ID, String name) {
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
    public void add(IBranchCategory branchCategory) {
        this.subCategories.add(branchCategory);
    }

    @Override
    public void add(ILeafCategory leafCategory) {
        this.subCategories.add(leafCategory);
    }

    @Override
    public List getSubCategories() {
        return this.subCategories;
    }

    @Override
    public String getDetails() {
        StringBuffer details = new StringBuffer();
        details.append("分支分类：ID=").append(this.id).append(" name=").append(this.name).append("\n");
        for (Object sub : this.subCategories) {
            if (sub instanceof IBranchCategory) {
                details.append("\t").append(((IBranchCategory) sub).getDetails());
            } else {
                details.append("\t").append(((ILeafCategory) sub).getDetails());
            }
        }
        return details.toString();
    }
}
