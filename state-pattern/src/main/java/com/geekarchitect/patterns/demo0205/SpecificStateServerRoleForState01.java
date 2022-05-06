package com.geekarchitect.patterns.demo0205;

import com.geekarchitect.patterns.demo0204.IStateServerRole;

/**
 * 状态01对应的特定状态服务方对象
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/27
 */
public class SpecificStateServerRoleForState01 extends AbstractSpecificStateServerRole {

    public SpecificStateServerRoleForState01(IStateServerRole stateServerRole, StateServer4Helper stateServer4Helper) {
        super(stateServerRole, stateServer4Helper);
    }

    @Override
    public void stateServer4() {
        stateServer4Helper.stateServer4ForBiz01();
    }

}
