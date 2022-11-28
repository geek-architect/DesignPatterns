package com.geekarchitect.patterns.observer.demo02;

import com.geekarchitect.patterns.observer.demo01.BookBusinessService;
import com.geekarchitect.patterns.observer.demo01.IBusinessService;
import com.geekarchitect.patterns.observer.demo01.MobileBusinessService;
import com.geekarchitect.patterns.observer.demo01.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/17
 */
@Service
public class OrderServiceV2 implements IOrderServiceV2, InitializingBean {
    private static final Logger LOG = LoggerFactory.getLogger(OrderServiceV2.class);
    private final List<IBusinessService> businessServiceList = new ArrayList<>();

    @Override
    public void pay(OrderInfo orderInfo) {
        LOG.info("订单中台：订单支付成功");
        this.notifyAllBusinessService(orderInfo);
    }

    @Override
    public void addBusinessService(IBusinessService businessService) {
        businessServiceList.add(businessService);
    }

    @Override
    public void removeBusinessService(IBusinessService businessService) {
        //
    }

    @Override
    public void notifyAllBusinessService(OrderInfo orderInfo) {
        LOG.info("订单中台：迭代通知所有的垂直业务部门");
        businessServiceList.stream().forEach(businessService -> businessService.doService(orderInfo));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOG.info("订单中台：初始化所有的垂直业务部门");
        this.addBusinessService(new BookBusinessService());
        this.addBusinessService(new MobileBusinessService());
    }
}
