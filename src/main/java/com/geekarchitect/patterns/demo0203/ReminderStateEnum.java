package com.geekarchitect.patterns.demo0203;

/**
 * 催单状态枚举
 */
public enum ReminderStateEnum {
    BEFORE_DELIVER("发货前", 0), AFTER_DELIVER("发货后", 1);

    private String name;
    private int code;

    ReminderStateEnum(String name, int code) {
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
