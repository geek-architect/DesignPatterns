package com.geekarchitect.patterns.demo0203;

import com.geekarchitect.patterns.demo0201.IOrderService;
import com.geekarchitect.patterns.demo0201.OrderInfo;
import com.geekarchitect.patterns.demo0202.AbstractOrderStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 已发货订单状态服务
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class DeliveredOrderStateService extends AbstractOrderStateServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(DeliveredOrderStateService.class);

    public DeliveredOrderStateService(IOrderService orderService) {
        super(orderService);
    }

}
