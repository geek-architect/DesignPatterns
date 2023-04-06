package com.geekarchitect.patterns.adapter.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/16
 */
public class WeChatPay implements IPayment {
    private static final Logger LOG = LoggerFactory.getLogger(WeChatPay.class);

    @Override
    public void pay(PayInfo payInfo) {
        LOG.info("微信支付");
    }
}
