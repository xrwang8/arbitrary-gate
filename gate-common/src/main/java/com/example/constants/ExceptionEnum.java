package com.example.constants;

/**
 * @Description:
 * @author: xrwang8
 * @Date: 2021/2/4 11:13
 */
public enum ExceptionEnum {
    /**
     * 参数错误
     */
    PARAM_ERROR(1000, "param error"),
    /**
     * 服务未发现
     */
    SERVICE_NOT_FIND(1001, "service not find,maybe not register"),
    /**
     * 无效的配置
     */
    CONFIG_ERROR(1002, "invalid config"),
    /**
     * 用户名或者密码错误
     */
    LOGIN_ERROR(1003, "userName or password error"),
    /**
     * 未登录
     */
    NOT_LOGIN(1004, "not login"),
    /**
     * token error
     */
    TOKEN_ERROR(1005, "token error");

    private Integer code;

    private String msg;

    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
