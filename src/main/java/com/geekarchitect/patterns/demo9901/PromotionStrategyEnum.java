package com.geekarchitect.patterns.demo9901;

/**
 * 促销策略枚举类
 *
 * @author: 极客架构师@吴念
 * @date: 2022/3/26
 * @param:
 * @return:
 */
public enum PromotionStrategyEnum {
    NONE("无", 0), CASH_BACK("满减", 1), BUY_MORE("多买优惠", 2), FOR_PLUS("plus会员优惠", 3);
    private String name;
    private int code;

    PromotionStrategyEnum(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
