package com.xuanwu.xtion.task.entity;

import java.io.Serializable;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
public class Task {

    private Long taskId;

    private String taskName;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
