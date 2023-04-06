package com.geekarchitect.patterns.adapter.demo02;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/16
 */
@Data
public class AlipayAdapter implements IPayment {
    private Alipay alipay;

    @Override
    public void pay(PayInfo payInfo) {
        //参数转换
        Map<String, String> payMap = new HashMap<>();
        payMap.put("memberID", payInfo.getMemberID().toString());
        payMap.put("price", payInfo.getPrice().toString());
        payMap.put("orderID", payInfo.getOrderID().toString());
        payMap.put("payDate", payInfo.getPayDate().toString());
        alipay.payTo(payMap);
    }
}
