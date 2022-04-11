package com.geekarchitect.patterns.demo0002;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 北京移动订单服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/3
 */
public class BjMobileOrderService extends AbstractOrderService {

    private static final Logger lOG = LoggerFactory.getLogger(BjMobileOrderService.class);

    /**
     * 北京移动提供实名认证服务，所以覆盖了父类提供的方法。
     *
     * @author: 极客架构师@吴念
     * @date: 2022/3/10
     * @param:
     * @return:
     */
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
    public boolean sendOrder(OrderInfo orderInfo) {
        lOG.info("第四步：发送订单信息给{}Boss系统", orderInfo.getOperatorName());
        return true;
    }

}
