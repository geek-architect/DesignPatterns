package com.geekarchitect.patterns.demo0305;

import lombok.Data;

/**
 * 细粒度角色代理类：
 * 继承细粒度角色
 * 保持元角色在缓存中的key
 * 内部状态，一般不提供set方法
 * @author 极客架构师@吴念
 * @createTime 2022/5/9
 */
@Data
public class FineGrainedRoleProxy extends FineGrainedRole {
    /**
     * 元角色缓存key
     */
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
