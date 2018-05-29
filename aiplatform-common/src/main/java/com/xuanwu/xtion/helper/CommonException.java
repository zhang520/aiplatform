package com.xuanwu.xtion.helper;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
public class CommonException extends Exception {

    public CommonException(int status) { this.status = status; }

    public CommonException(int status, String errorMessage) { this.status = status; this.errorMessage = errorMessage; }

    public CommonException(int status, Throwable cause) { super(cause); this.status = status; }

    private final int status;

    private String errorMessage;

    public int getStatus() {
        return status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
