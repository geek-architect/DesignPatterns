package com.geekarchitect.patterns.demo0001;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 北京移动订单服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/3
 */
public class BjMobileOrderService implements IOrderSerivce {

    private static final Logger lOG = LoggerFactory.getLogger(BjMobileOrderService.class);

    @Override
    public boolean identityVerification(OrderInfo orderInfo) {
        lOG.info("第一步：实名认证，调用{}Boss系统", orderInfo.getOperatorName());
        return true;
    }

    @Override
    public boolean fiveCardOnePerson(OrderInfo orderInfo) {
        lOG.info("第二步：一证五号验证，调用{}Boss系统", orderInfo.getOperatorName());
        return true;
    }

    @Override
    public void lockMobile(OrderInfo orderInfo) {
        lOG.info("第三步：调用公司锁定号码服务");
    }

    @Override
    public boolean sendOrder(OrderInfo orderInfo) {
        lOG.info("第四步：发送订单信息给{}Boss系统", orderInfo.getOperatorName());
        return true;
    }

    @Override
    public boolean createOrder(OrderInfo orderInfo) {
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
        result = sendOrder(orderInfo);
        if (!result) {
            lOG.info("发送订单信息失败");
            return result;
        }
        lOG.info("提交订单成功");
        return result;
    }
}
