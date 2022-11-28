package com.geekarchitect.patterns.observer.demo03;

import com.geekarchitect.patterns.observer.demo01.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * 手机业务服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/11/17
 */
public class MobileBusinessServiceV3 implements Observer {
    private static final Logger LOG = LoggerFactory.getLogger(MobileBusinessServiceV3.class);

    @Override
    public void update(Observable o, Object arg) {
        OrderInfo orderInfo = (OrderInfo) arg;
        LOG.info("垂直业务部门：手机业务服务,订单信息{}", orderInfo);
    }
}
