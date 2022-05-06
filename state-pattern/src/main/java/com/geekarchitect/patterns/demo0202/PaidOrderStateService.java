package com.geekarchitect.patterns.demo0202;

import com.geekarchitect.patterns.demo0201.IOrderService;
import com.geekarchitect.patterns.demo0201.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 已支付订单状态服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class PaidOrderStateService extends AbstractOrderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(PaidOrderStateService.class);

    public PaidOrderStateService(IOrderService orderService) {
        super(orderService);
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        //此处省略几百行业务代码
        LOG.info("催单成功");
        return true;
    }
}
