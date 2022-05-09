package com.geekarchitect.patterns.demo0305;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 元工厂角色：
 * 因为它里面管理了缓存池，所以一般采用单例模式
 * 获取元角色的方法(getFlyweightRole)是重点，它里面通常包含初始化缓存池对象的代码。
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/7
 */
public class FlyweightFactoryRole {
    private static final Logger LOG = LoggerFactory.getLogger(FlyweightFactoryRole.class);
    private static final FlyweightFactoryRole flyweightFactoryRole = new FlyweightFactoryRole();
    private static final Map<String, FlyweightRole> flyweightRoleMap = new HashMap<>();

    private FlyweightFactoryRole() {
    }

    public static FlyweightFactoryRole getInstance() {
        return flyweightFactoryRole;
    }

    public FlyweightRole getFlyweightRole(String flyweightKey) {
        LOG.info("调用工厂方法getFlyweightRole");
        FlyweightRole flyweightRole = null;
        if (!flyweightRoleMap.containsKey(flyweightKey)) {
            flyweightRole = new FlyweightRole();
            //初始化操作
            flyweightRole.setIntrinsicState1("内部状态1");
            flyweightRole.setIntrinsicState2("内部状态2");
            LOG.info("初始化内部状态");
            flyweightRoleMap.put(flyweightKey, flyweightRole);
        }
        return flyweightRoleMap.get(flyweightKey);
    }

    public UnsharedFlyweightRole getUnsharedFlyweightRole(FineGrainedRole fineGrainedRole) {
        LOG.info("调用工厂方法getUnsharedFlyweightRole");
        UnsharedFlyweightRole unsharedFlyweightRole = new UnsharedFlyweightRole(fineGrainedRole);
        //初始化操作
        unsharedFlyweightRole.setIntrinsicState1("内部状态1");
        unsharedFlyweightRole.setIntrinsicState2("内部状态2");
        return unsharedFlyweightRole;
    }
}
