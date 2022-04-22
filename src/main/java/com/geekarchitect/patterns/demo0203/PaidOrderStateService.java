package com.geekarchitect.patterns.demo0203;

import com.geekarchitect.patterns.demo0201.IOrderService;
import com.geekarchitect.patterns.demo0201.OrderInfo;
import com.geekarchitect.patterns.demo0202.AbstractOrderStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 已支付订单状态服务
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class PaidOrderStateService extends AbstractOrderStateServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(PaidOrderStateService.class);
    public PaidOrderStateService(IOrderService orderService) {
        super(orderService);
    }

}
