package com.example.constants;

/**
 * @Description:
 * @author: xrwang8
 * @Date: 2021/2/4 10:40
 */
public enum EnabledEnum {

    NOT_ENABLE((byte) 0, "未启用"),

    ENABLE((byte) 1, "启用");

    private Byte code;

    private String desc;

    EnabledEnum(Byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
