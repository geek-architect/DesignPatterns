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
public class HasBoughtCommand implements Command {
    private static final Logger LOG = LoggerFactory.getLogger(IsPlusHandler.class);

    @Override
    public boolean execute(Context context) throws Exception {
        LOG.info("HasBoughtCommand");
        boolean hasBought = new Random().nextBoolean();
        boolean result = CONTINUE_PROCESSING;
        if (hasBought) {
            result=PROCESSING_COMPLETE;
            LOG.info("已购买该店铺商品，校验终止 hasBought={}", hasBought);
        } else {
            LOG.info("未购买该店铺商品，继续校验 hasBought={}", hasBought);
        }
        return result;
    }
}
