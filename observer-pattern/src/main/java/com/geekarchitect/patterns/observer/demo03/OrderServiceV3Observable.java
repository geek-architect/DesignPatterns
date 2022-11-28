package com.geekarchitect.patterns.observer.demo03;

import com.geekarchitect.patterns.observer.demo01.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Observable;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/17
 */
@Service
@Scope("prototype")
public class OrderServiceV3Observable extends Observable implements InitializingBean {
    private static final Logger LOG = LoggerFactory.getLogger(OrderServiceV3Observable.class);

    public void pay(OrderInfo orderInfo) {
        LOG.info("订单中台：订单支付成功");
        this.setChanged();//修改状态
        this.notifyObservers(orderInfo);//通知观察者
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOG.info("订单中台：初始化垂直业务部门");
        this.addObserver(new MobileBusinessServiceV3());
        this.addObserver(new BookBusinessServiceV3());
    }
}
