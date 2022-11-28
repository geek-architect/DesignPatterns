package com.geekarchitect.patterns.observer.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 手机业务服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/11/17
 */
@Component
public class BookBusinessService implements IBusinessService {
    private static final Logger LOG = LoggerFactory.getLogger(BookBusinessService.class);

    @Override
    public void doService(OrderInfo orderInfo) {
        LOG.info("垂直业务部门：图书业务服务");
    }
}
