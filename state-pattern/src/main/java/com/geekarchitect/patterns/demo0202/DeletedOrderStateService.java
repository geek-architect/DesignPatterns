package com.geekarchitect.patterns.demo0202;

import com.geekarchitect.patterns.demo0201.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 已删除订单状态服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class DeletedOrderStateService extends AbstractOrderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(DeletedOrderStateService.class);

    public DeletedOrderStateService(IOrderService orderService) {
        super(orderService);
    }
}
