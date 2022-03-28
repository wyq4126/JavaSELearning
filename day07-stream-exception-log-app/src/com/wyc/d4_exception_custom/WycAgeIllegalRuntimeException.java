package com.wyc.d4_exception_custom;

/**
 * 自定义编译异常
 */
public class WycAgeIllegalException extends Exception {
    public WycAgeIllegalException() {
    }

    public WycAgeIllegalException(String message) {
        super(message);
    }
}
