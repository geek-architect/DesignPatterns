package com.geekarchitect.patterns.adapter.demo02;

import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/16
 */
@Data
public class PaymentService {
    private IPayment payment;

    public void pay(PayInfo payInfo) {
        payment.pay(payInfo);
    }
}
