package com.geekarchitect.patterns.demo0201;

public enum OrderStateEnum {
    UNPAID("未支付", 0), PAID("已支付", 1), DELIVERED("已发货", 2), DONE("已妥投", 3), DELETED("已删除", 4);

    private String name;
    private int code;

    OrderStateEnum(String name, int code) {
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
