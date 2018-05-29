package com.xuanwu.xtion.task.rest;

import com.xuanwu.xtion.helper.rest.RestHelper;
import com.xuanwu.xtion.task.entity.Task;
import com.xuanwu.xtion.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
@Component
@Path("/task")
@Produces(MediaType.APPLICATION_JSON)
public class TaskServiceRest {

    @Autowired
    private TaskService taskService;

    /**
     * 新增任务
     * @param task
     * @return
     */
    @POST
    @Path("/submit")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response put(@BeanParam Task task) {
        return Response.ok().build();
    }

    @GET
    @Path("/get/{taskid}")
    public Response get(@PathParam("taskid") Long taskId) {
        System.out.println("this id is " + taskId);
        return RestHelper.success(taskService.get(taskId.longValue()));
    }
}
