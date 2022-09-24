package com.geekarchitect.patterns.cor.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请求发送者角色
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/15
 */
public class Sender {
    private static final Logger LOG = LoggerFactory.getLogger(Sender.class);

    public void service() {
        LOG.info("请求发送者角色:Sender");
        LOG.info("封装请求对象");
        Request request = new Request();
        Response response = new Response();
        Chain chain = new Chain();
        chain.getFirstHandler().handleRequest(request, response);
    }
}
