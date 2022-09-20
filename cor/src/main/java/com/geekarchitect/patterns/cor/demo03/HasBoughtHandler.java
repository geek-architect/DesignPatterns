package com.geekarchitect.patterns.cor.demo03;

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
public class HasBoughtHandler extends AbstractVerificationHandler {
    private static final Logger LOG = LoggerFactory.getLogger(HasBoughtHandler.class);

    @Override
    protected Response doHandle(Request request) {
        LOG.info("Handler层");
        Response response = new Response();
        Boolean result = new Random().nextBoolean();
        response.setIsOk(result);
        LOG.info("是否已购买该店铺商品={}", result);
        return response;
    }
}
