package com.xuanwu.xtion.helper;

public enum ErrorCode {

    INITIALIZE_EROOR(100001, "初始化异常");

    private final int errorCode;

    private final String errorMessage;

    private ErrorCode(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
