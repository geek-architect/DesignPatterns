package com.geekarchitect.patterns.cor.demo04;

import org.apache.commons.chain.impl.ChainBase;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * chain组件
 * 链管理者角色
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Component
public class ActivityCommandChainA extends ChainBase implements InitializingBean {
    @Autowired
    private IsPlusCommand isPlusCommand;
    @Autowired
    private HasFollowedShopCommand hasFollowedShopCommand;
    @Autowired
    private HasBoughtCommand hasBoughtCommand;

    public ActivityCommandChainA() {
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //将请求处理者角色加入链中
        addCommand(isPlusCommand);
        addCommand(hasFollowedShopCommand);
        addCommand(hasBoughtCommand);
    }
}
