package com.lfw.bank.exception;

/**
 * 应用异常
 */
public class AppException extends Exception {
    public AppException() {
    }

    public AppException(String msg) {
        super(msg);
    }
}

