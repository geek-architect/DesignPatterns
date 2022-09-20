package com.geekarchitect.patterns.cor.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Component
public class VerificationImpl implements IVerification {
    private static final Logger LOG = LoggerFactory.getLogger(VerificationImpl.class);

    @Override
    public Boolean isPlus(Member member) {
        LOG.info("Component层");
        Boolean result = new Random().nextBoolean();
        LOG.info("是否plus会员={}", result);
        return result;
    }

    @Override
    public Boolean hasFollowedShop(Member member, Activity activity) {
        LOG.info("Component层");
        Boolean result = new Random().nextBoolean();
        LOG.info("是否已关注该店铺={}", result);
        return result;
    }

    @Override
    public Boolean HasBought(Member member, Activity activity) {
        LOG.info("Component层");
        Boolean result = new Random().nextBoolean();
        LOG.info("是否已购买过店铺商品={}", result);
        return result;
    }
}
