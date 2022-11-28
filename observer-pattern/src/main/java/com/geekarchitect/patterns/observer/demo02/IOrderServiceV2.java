package com.geekarchitect.patterns.observer.demo02;

import com.geekarchitect.patterns.observer.demo01.IBusinessService;
import com.geekarchitect.patterns.observer.demo01.OrderInfo;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/17
 */
public interface IOrderServiceV2 {
    void pay(OrderInfo orderInfo);

    void addBusinessService(IBusinessService businessService);

    void removeBusinessService(IBusinessService businessService);

    void notifyAllBusinessService(OrderInfo orderInfo);
}
