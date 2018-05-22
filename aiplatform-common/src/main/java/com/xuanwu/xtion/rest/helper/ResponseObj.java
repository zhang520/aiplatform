package com.xuanwu.xtion.rest.helper;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
public class ResponseObj {

    private long requestId;

    public int status;

    public Object resultParam;

    public ResponseObj(Status status, Object resultParam) {
        this.requestId = System.currentTimeMillis();
        this.status = status.getCode();
        this.resultParam = resultParam;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status.getCode();
    }

    public Object getResultParam() {
        return resultParam;
    }

    public void setResultParam(Object resultParam) {
        this.resultParam = resultParam;
    }

    public enum Status {

        OK(20001, "请求成功"), FAIL(50001, "请求失败"), ERROR(500002, "服务器错误");

        private final int code;

        private final String reason;

        private Status(int code, String reason) {
            this.code = code;
            this.reason = reason;
        }

        public int getCode() {
            return code;
        }

        public String getReason() {
            return reason;
        }
    }
}
