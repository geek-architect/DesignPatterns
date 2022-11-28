package com.geekarchitect.patterns.observer.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/17
 */
@Service
public class OrderService implements IOrderService {
    private static final Logger LOG = LoggerFactory.getLogger(OrderService.class);
    @Resource()
    private IBusinessService mobileBusinessService;
    @Resource()
    private IBusinessService bookBusinessService;

    @Override
    public void pay(OrderInfo orderInfo) {
        LOG.info("订单中台：订单支付成功");
        LOG.info("订单中台：逐个调用垂直业务部门的服务");
        mobileBusinessService.doService(orderInfo);
        bookBusinessService.doService(orderInfo);
    }
}
