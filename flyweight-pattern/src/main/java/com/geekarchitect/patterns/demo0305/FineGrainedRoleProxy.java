package com.geekarchitect.patterns.demo0305;

import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/9
 */
@Data
public class FineGrainedRoleProxy extends FineGrainedRole{
    private String flyweightKey;

    public FineGrainedRoleProxy(String flyweightKey) {
        this.flyweightKey = flyweightKey;
    }

    @Override
    public String getIntrinsicState1() {
        return FlyweightFactoryRole.getInstance().getFlyweightRole(flyweightKey).getIntrinsicState1();
    }

    @Override
    public String getIntrinsicState2() {
        return FlyweightFactoryRole.getInstance().getFlyweightRole(flyweightKey).getIntrinsicState2();
    }
}
