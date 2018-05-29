package com.xuanwu.xtion.log;

public class LogWriter {
    private static class InstanceHolder {
        private final static LogWriter LOG_WRITER = new LogWriter();
    }

    public static LogWriter getInstance() {
        return InstanceHolder.LOG_WRITER;
    }


}
