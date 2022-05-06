package com.geekarchitect.patterns.demo0204;

/**
 * 特定状态服务方-抽象类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/20
 */
public abstract class AbstractSpecificStateServerRole implements ISpecificStateServerRole {
    protected IStateServerRole stateServerRole;

    public AbstractSpecificStateServerRole(IStateServerRole stateServerRole) {
        this.stateServerRole = stateServerRole;
    }

    @Override
    public void stateServer1() {
        //默认实现
    }

    @Override
    public void stateServer2() {
        //默认实现
    }


}
