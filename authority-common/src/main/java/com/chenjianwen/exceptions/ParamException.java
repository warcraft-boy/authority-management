package com.chenjianwen.exceptions;

/**
 * @Description: <br>
 * @Date: Created in 2019/8/23 <br>
 * @Author: chenjianwen
 */
public class ParamException extends RuntimeException{

    public ParamException() {
        super();
    }

    public ParamException(String message) {
        super(message);
    }

    public ParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParamException(Throwable cause) {
        super(cause);
    }

    protected ParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
