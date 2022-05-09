package com.geekarchitect.patterns.demo0305;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 客户方角色
 * @author 极客架构师@吴念
 * @createTime 2022/5/9
 */
public class ClientRole {
    private static final Logger LOG = LoggerFactory.getLogger(ClientRole.class);

    /**
     * 以细粒度对象作为主角，可以节省内存资源
     */
    public void fineGrainedRolePlayLead() {
        LOG.info("细粒度对象做为主角");
        String flyweightKey = "key1";
        FineGrainedRole fineGrainedRole = new FineGrainedRoleProxy(flyweightKey);
        fineGrainedRole.setExtrinsicState1("外部状态1");
        fineGrainedRole.setExtrinsicState2("外部状态2");
        fineGrainedRole.server();
    }

    /**
     * 以元角色对象作为主角，可以节省CPU资源
     */
    public void flyweightPlayLead() {
        LOG.info("元对象做为主角");
        String flyweightKey = "key1";
        FineGrainedRole fineGrainedRole = new FineGrainedRoleProxy(flyweightKey);
        fineGrainedRole.setExtrinsicState1("外部状态1");
        fineGrainedRole.setExtrinsicState2("外部状态2");
        FlyweightRole flyweightRole = FlyweightFactoryRole.getInstance().getFlyweightRole(flyweightKey);
        flyweightRole.server(fineGrainedRole);

    }

}
