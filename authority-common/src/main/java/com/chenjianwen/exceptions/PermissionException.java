package com.chenjianwen.exceptions;

/**
 * @Description: <br>
 * @Date: Created in 2019/8/23 <br>
 * @Author: chenjianwen
 */
public class PermissionException extends RuntimeException{

    public PermissionException() {
        super();
    }

    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionException(Throwable cause) {
        super(cause);
    }

    protected PermissionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
