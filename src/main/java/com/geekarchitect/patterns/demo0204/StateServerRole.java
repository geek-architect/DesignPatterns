package com.geekarchitect.patterns.demo0204;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 状态服务方-实现类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class StateServerRole implements IStateServerRole {

    private static final Logger LOG = LoggerFactory.getLogger(StateServerRole.class);

    private final Map<Integer, ISpecificStateServerRole> specificStateServerRoleMap = new HashMap<>();


    public StateServerRole() {
        LOG.info("状态服务方：StateServerRole，初始化特定状态服务方对象");
        specificStateServerRoleMap.put(StateEnum.STATE01.ordinal(), new SpecificStateServerRole01(this));
        specificStateServerRoleMap.put(StateEnum.STATE02.ordinal(), new SpecificStateServerRole02(this));
    }

    private ISpecificStateServerRole getSpecificStateServer() {
        LOG.info("状态服务方：StateServerRole，根据状态获取相应的特定状态服务方对象");
        //根据实际业务实现该代码
        return specificStateServerRoleMap.get(StateEnum.STATE01.ordinal());
    }

    @Override
    public void stateServer1() {
        LOG.info("状态服务方：StateServerRole，执行stateServer1");
        ISpecificStateServerRole specificStateServerRole = getSpecificStateServer();
        specificStateServerRole.stateServer1();
    }

    @Override
    public void stateServer2() {
        LOG.info("状态服务方：StateServerRole，执行stateServer2");
        ISpecificStateServerRole specificStateServerRole = getSpecificStateServer();
        specificStateServerRole.stateServer2();
    }

    @Override
    public void changeState() {
        LOG.info("状态服务方：StateServerRole，执行changeState");
    }

    @Override
    public void unStateServer() {

    }


}
