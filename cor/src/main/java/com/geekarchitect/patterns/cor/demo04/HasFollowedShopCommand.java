package com.geekarchitect.patterns.cor.demo04;

import com.geekarchitect.patterns.cor.demo03.IsPlusHandler;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Component
@Scope("prototype")
public class HasFollowedShopCommand implements Command {
    private static final Logger LOG = LoggerFactory.getLogger(IsPlusHandler.class);

    @Override
    public boolean execute(Context context) throws Exception {
        LOG.info("HasFollowedShopCommand");
        boolean hasFollowedShop = new Random().nextBoolean();
        boolean isStop = hasFollowedShop;
        if (isStop) {
            LOG.info("已关注该店铺，校验终止 hasFollowedShop={}", hasFollowedShop);
        } else {
            LOG.info("未关注该店铺，继续校验 hasFollowedShop={}", hasFollowedShop);
        }
        return isStop;
    }
}
