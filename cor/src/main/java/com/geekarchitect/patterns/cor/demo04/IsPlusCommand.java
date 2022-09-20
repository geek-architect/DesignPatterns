package com.geekarchitect.patterns.cor.demo04;

import com.geekarchitect.patterns.cor.demo03.IsPlusHandler;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * command组件
 * 请求处理者角色
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Component
public class IsPlusCommand implements Command {
    private static final Logger LOG = LoggerFactory.getLogger(IsPlusHandler.class);

    @Override
    public boolean execute(Context context) throws Exception {
        LOG.info("IsPlusCommand");
        boolean isPlus = new Random().nextBoolean();
        boolean isStop = !isPlus;
        if (isStop) {
            LOG.info("非plus会员，校验终止 isPlus={}", isPlus);
        } else {
            LOG.info("plus会员，继续校验 isPlus={}", isPlus);
        }
        return isStop;
    }
}
