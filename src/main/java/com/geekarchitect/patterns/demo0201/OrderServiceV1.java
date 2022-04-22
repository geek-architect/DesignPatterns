package com.geekarchitect.patterns.demo0201;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 订单服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/15
 */
public class OrderServiceV1 implements IOrderService {
    private static final Logger LOG = LoggerFactory.getLogger(OrderServiceV1.class);

    @Override
    public boolean pay(OrderInfo orderInfo) {
        boolean result = false;
        switch (orderInfo.getOrderStateEnum()) {
            case UNPAID:
                //此处省略几百行业务代码
                LOG.info("支付成功");
                changeState(orderInfo, OrderStateEnum.PAID);
                result = true;
                break;
            default:
                LOG.info("无法支付");
        }
        return result;
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        boolean result = false;
        switch (orderInfo.getOrderStateEnum()) {
            case PAID:
            case DELIVERED:
                //此处省略几百行业务代码
                LOG.info("催单成功");
                result = true;
                break;
            default:
                LOG.info("无法催单");
        }
        return result;
    }

    @Override
    public boolean delete(OrderInfo orderInfo) {
        boolean result = false;
        switch (orderInfo.getOrderStateEnum()) {
            case UNPAID:
            case DONE:
                //此处省略几百行业务代码
                LOG.info("删除成功");
                changeState(orderInfo, OrderStateEnum.DELETED);
                result = true;
                break;
            default:
                LOG.info("无法删除");
        }
        return result;
    }

    @Override
    public void changeState(OrderInfo orderInfo, OrderStateEnum newState) {
        LOG.info("订单状态：由{}转变为{}", orderInfo.getOrderStateEnum().getName(), newState.getName());
        orderInfo.setOrderStateEnum(newState);
    }
}
