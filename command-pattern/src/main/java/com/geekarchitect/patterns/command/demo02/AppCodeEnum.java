package com.geekarchitect.patterns.command.demo02;

public enum AppCodeEnum {
    NONE("无", 0), RECOMMEND("商品推荐", 1), REVIEW("商品评价", 2);
    private String name;
    private int code;

    AppCodeEnum(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public static AppCodeEnum getEnumByCode(int code) {
        AppCodeEnum result = null;
        for (AppCodeEnum item : AppCodeEnum.values()) {
            if (item.getCode() == code) {
                result = item;
                break;
            }
        }
        return result;
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
