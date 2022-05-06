package com.geekarchitect.patterns.demo0203;

import com.geekarchitect.patterns.demo0201.IOrderService;
import com.geekarchitect.patterns.demo0201.OrderInfo;
import com.geekarchitect.patterns.demo0201.OrderStateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 未支付订单状态服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class UnpaidOrderStateService extends AbstractOrderStateServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(UnpaidOrderStateService.class);

    public UnpaidOrderStateService(IOrderService orderService) {
        super(orderService);
    }

    @Override
    public boolean pay(OrderInfo orderInfo) {
        LOG.info("支付成功");
        this.orderService.changeState(orderInfo, OrderStateEnum.PAID);
        return true;
    }

    @Override
    public boolean delete(OrderInfo orderInfo) {
        LOG.info("删除成功");
        this.orderService.changeState(orderInfo, OrderStateEnum.DELETED);
        return true;
    }
}
