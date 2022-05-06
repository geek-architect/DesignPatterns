package com.geekarchitect.patterns.demo0203;

import com.geekarchitect.patterns.demo0201.IOrderService;
import com.geekarchitect.patterns.demo0201.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 催单方法：适合所有发货后的状态
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class AfterDeliverReminderStateService implements IReminderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(AfterDeliverReminderStateService.class);
    private final IOrderService orderService;

    public AfterDeliverReminderStateService(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        //此处省略几百行业务代码
        LOG.info("发货后催单成功");
        return true;
    }
}
