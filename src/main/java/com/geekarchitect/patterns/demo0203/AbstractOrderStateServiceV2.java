package com.geekarchitect.patterns.demo0203;

import com.geekarchitect.patterns.demo0201.IOrderService;
import com.geekarchitect.patterns.demo0201.OrderInfo;
import com.geekarchitect.patterns.demo0202.IOrderStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单服务抽象类
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class AbstractOrderStateServiceV2 implements IOrderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractOrderStateServiceV2.class);
    protected IOrderService orderService;
    private Map<Integer,IReminderStateService> reminderStateServiceMap=new HashMap<>();

    public AbstractOrderStateServiceV2(IOrderService orderService) {
        this.orderService=orderService;
        reminderStateServiceMap.put(ReminderStateEnum.BEFORE_DELIVER.getCode(),new BeforeDeliverReminderStateService(this.orderService));
        reminderStateServiceMap.put(ReminderStateEnum.AFTER_DELIVER.getCode(), new AfterDeliverReminderStateService(this.orderService));
    }

    @Override
    public boolean pay(OrderInfo orderInfo) {
        LOG.info("订单状态：{},无法支付",orderInfo.getOrderStateEnum().getName());
        return false;
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        switch (orderInfo.getOrderStateEnum()){
            case PAID:
                return reminderStateServiceMap.get(ReminderStateEnum.BEFORE_DELIVER).reminder(orderInfo);
            case DELIVERED:
                return reminderStateServiceMap.get(ReminderStateEnum.AFTER_DELIVER).reminder(orderInfo);
            default:
                LOG.info("订单状态：{},无法催单",orderInfo.getOrderStateEnum().getName());
                return false;
        }
    }

    @Override
    public boolean delete(OrderInfo orderInfo) {
        LOG.info("订单状态：{},无法删除",orderInfo.getOrderStateEnum().getName());
        return false;
    }

}
