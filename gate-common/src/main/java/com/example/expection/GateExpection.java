package com.example.expection;

import com.example.constants.ExceptionEnum;
import lombok.Data;

/**
 * @Description:
 * @author: xrwang8
 * @Date: 2021/2/4 11:12
 */
@Data
public final class GateExpection extends RuntimeException {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;


    public GateExpection(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
        this.msg = exceptionEnum.getMsg();
    }

    public GateExpection(String errMsg) {
        super(errMsg);
        this.msg = errMsg;
        this.code = 5000;
    }

    public GateExpection(Integer code, String errMsg) {
        this.code = code;
        this.msg = errMsg;
    }


}
