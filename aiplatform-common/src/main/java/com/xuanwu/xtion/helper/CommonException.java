package com.xuanwu.xtion.helper;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
public class CommonException extends RuntimeException {

    public CommonException(int errorCode) { this.errorCode = errorCode; }

    public CommonException(int errorCode, String errorMessage) { this(errorCode); this.errorMessage = errorMessage; }

    public CommonException(int errorCode, Throwable cause) { super(cause); this.errorCode = errorCode; }

    public CommonException(ErrorCode errorCode) {this.errorCode = errorCode.getErrorCode(); this.errorMessage = errorCode.getErrorMessage(); }

    public CommonException(ErrorCode errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode.getErrorCode();
        this.errorMessage = errorCode.getErrorMessage();
    }

    private final int errorCode;

    private String errorMessage;

    public int getStatus() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
