package com.geekarchitect.patterns.demo0002;

import lombok.Data;

/**
 * 会员订单信息
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/3
 */
@Data
public class OrderInfo {
    /**
     * 会员id
     */
    private String memberID;
    /**
     * 会员选购的手机号码
     */
    private String mobileNumber;
    /**
     * 会员姓名
     */
    private String memberName;
    /**
     * 会员身份证号码
     */
    private String memberIdentityCard;
    /**
     * 运营商名称
     */
    private String operatorName;
    /**
     * 运营商编号
     */
    private String operatorID;
}
