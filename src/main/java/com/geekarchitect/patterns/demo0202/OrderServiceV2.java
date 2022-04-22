package com.geekarchitect.patterns.demo0202;

import com.geekarchitect.patterns.demo0201.IOrderService;
import com.geekarchitect.patterns.demo0201.OrderInfo;
import com.geekarchitect.patterns.demo0201.OrderStateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单服务类
 * @author 极客架构师@吴念
 * @createTime 2022/4/15
 */
public class OrderServiceV2 implements IOrderService {
    private static final Logger LOG = LoggerFactory.getLogger(OrderServiceV2.class);
    private final Map<Integer, IOrderStateService> orderStateServiceMap = new HashMap<>();

    public OrderServiceV2() {
        //初始化状态服务对象
        orderStateServiceMap.put(OrderStateEnum.UNPAID.getCode(), new UnpaidOrderStateService(this));
        orderStateServiceMap.put(OrderStateEnum.PAID.getCode(), new PaidOrderStateService(this));
        orderStateServiceMap.put(OrderStateEnum.DELIVERED.getCode(), new DeliveredOrderStateService(this));
        orderStateServiceMap.put(OrderStateEnum.DELETED.getCode(), new DeletedOrderStateService(this));
    }

    private IOrderStateService getOrderStateService(OrderInfo orderInfo) {
        IOrderStateService orderStateService = orderStateServiceMap.get(orderInfo.getOrderStateEnum().getCode());
        if (orderStateService != null) {
            return orderStateService;
        }
        throw new UnsupportedOperationException("该状态不支持");
    }

    @Override
    public boolean pay(OrderInfo orderInfo) {
        IOrderStateService orderStateService = getOrderStateService(orderInfo);
        return orderStateService.pay(orderInfo);
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        IOrderStateService orderStateService = getOrderStateService(orderInfo);
        return orderStateService.reminder(orderInfo);
    }

    @Override
    public boolean delete(OrderInfo orderInfo) {
        IOrderStateService orderStateService = getOrderStateService(orderInfo);
        return orderStateService.delete(orderInfo);
    }

    @Override
    public void changeState(OrderInfo orderInfo, OrderStateEnum newState) {
        LOG.info("订单状态：由{}转变为{}", orderInfo.getOrderStateEnum().getName(), newState.getName());
        orderInfo.setOrderStateEnum(newState);
    }
}
