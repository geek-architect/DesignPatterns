package com.geekarchitect.patterns.demo0002;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/3/4
 */
public abstract class AbstractOrderService implements IOrderSerivce {
    private static final Logger lOG = LoggerFactory.getLogger(AbstractOrderService.class);

    /**
     * 个别运营商不提供实名认证服务，而是由我们狗厂调用工信部提供的接口服务
     * 钩子方法
     *
     * @author: 极客架构师@吴念
     * @date: 2022/3/10
     * @param:
     * @return:
     */
    @Override
    public boolean identityVerification(OrderInfo orderInfo) {
        lOG.info("第一步：实名认证，调用国家工信部提供的认证服务");
        return true;
    }

    @Override
    public final void lockMobile(OrderInfo orderInfo) {
        lOG.info("第三步：调用公司锁定号码服务");
    }

    @Override
    public final boolean createOrder(OrderInfo orderInfo) {
        boolean result = identityVerification(orderInfo);
        if (!result) {
            lOG.info("实名认证失败");
            return result;
        }
        result = fiveCardOnePerson(orderInfo);
        if (!result) {
            lOG.info("一证五号验证失败");
            return result;
        }
        lockMobile(orderInfo);
        if (!result) {
            lOG.info("号码锁定失败");
            return result;
        }
        result = sendOrder(orderInfo);
        if (!result) {
            lOG.info("发送订单信息失败");
            return result;
        }
        lOG.info("提交订单成功");
        return result;
    }
}
