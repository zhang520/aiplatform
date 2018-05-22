package com.xuanwu.xtion.task.service.impl;

import com.xuanwu.xtion.task.entity.Task;
import com.xuanwu.xtion.task.service.TaskService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Task get(long taskId) {
        return new Task();
    }
}
