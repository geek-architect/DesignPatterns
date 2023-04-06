package com.geekarchitect.patterns.adapter.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/16
 */
public class Alipay {
    private static final Logger LOG = LoggerFactory.getLogger(Alipay.class);

    void payTo(Map<String, String> payMap) {
        LOG.info("支付宝");
    }
}
