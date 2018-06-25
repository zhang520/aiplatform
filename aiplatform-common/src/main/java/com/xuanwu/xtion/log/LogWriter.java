package com.xuanwu.xtion.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

public class LogWriter {

    private static class InstanceHolder {
        private final static LogWriter LOG_WRITER = new LogWriter();
    }

    public static LogWriter getInstance() {
        return InstanceHolder.LOG_WRITER;
    }

    public void write(String log, Level level) {
        Logger logger = null;
        switch (level) {
            case ERROR:
                logger = LoggerFactory.getLogger("errorLogger");
                logger.error(log);
                break;
            case TRACE:
                logger = LoggerFactory.getLogger("warnLogger");
                logger.warn(log);
                break;
            case INFO:
                logger = LoggerFactory.getLogger("infoLogger");
                logger.info(log);
                break;
            case WARN:
                logger = LoggerFactory.getLogger("warnLogger");
                logger.warn(log);
                break;
            case DEBUG:
                logger = LoggerFactory.getLogger("debugLogger");
                logger.debug(log);
                break;
        }
    }

    public void write(String mark, Level level, String... value) {
        Logger logger = null;
        switch (level) {
            case ERROR:
                logger = LoggerFactory.getLogger("errorLogger");
                logger.error(mark, value);
                break;
            case TRACE:
                logger = LoggerFactory.getLogger("warnLogger");
                logger.warn(mark, value);
                break;
            case INFO:
                logger = LoggerFactory.getLogger("infoLogger");
                logger.info(mark, value);
                break;
            case WARN:
                logger = LoggerFactory.getLogger("warnLogger");
                logger.warn(mark, value);
                break;
            case DEBUG:
                logger = LoggerFactory.getLogger("debugLogger");
                logger.debug(mark, value);
                break;
        }
    }

    public void write(LogData logData, Level level) {
        write(logData.toString(), level);
    }

    private void debug(String mark, String... value) {
        write(mark, Level.DEBUG, value);
    }

    public void debug(String log) {
        write(log, Level.DEBUG);
    }

    public void debug(LogData logData) {
        debug(logData.toString());
    }

    public void info(String mark, String... value) {
        write(mark, Level.INFO, value);
    }

    public void info(String log) {
        write(log, Level.INFO);
    }

    public void info(LogData logData) {
        info(logData.toString());
    }

    public void warn(String mark, String... value) {
        write(mark, Level.WARN, value);
    }

    public void warn(String log) {
        write(log, Level.WARN);
    }

    public void warn(LogData logData) {
        warn(logData.toString());
    }

    public void error(String mark, String... value) {
        write(mark, Level.ERROR, value);
    }

    public void error(String log) {
        write(log, Level.ERROR);
    }

    public void error(LogData logData) {
        error(logData.toString());
    }
}
