package com.geekarchitect.patterns.demo0205;

import com.geekarchitect.patterns.demo0204.IStateServerRole;

/**
 * 特定状态服务方-抽象类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/20
 */
public abstract class AbstractSpecificStateServerRole implements ISpecificStateServerRole {
    protected IStateServerRole stateServerRole;
    protected StateServer4Helper stateServer4Helper;

    public AbstractSpecificStateServerRole(IStateServerRole stateServerRole, StateServer4Helper stateServer4Helper) {
        this.stateServerRole = stateServerRole;
        this.stateServer4Helper = stateServer4Helper;
    }

    @Override
    public void stateServer4() {
        //默认实现
    }
}
