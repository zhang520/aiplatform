package com.xuanwu.xtion.helper.rest;

import com.xuanwu.xtion.helper.rest.ResponseObj;

import javax.ws.rs.core.Response;

/**
 * rest API 返回帮助类
 * Created by Mr.zhang on 2018/5/12.
 */
public class RestHelper {

    /**
     * 返回成功
     * @return
     */
    public static Response success() { return success(new Object()); }

    /**
     * 带结果返回成功
     * @param data 返回结果
     * @return
     */
    public static Response success(Object data) {
        ResponseObj obj = new ResponseObj(ResponseObj.Status.OK, data);
        return Response.ok().entity(obj).build();
    }

    /**
     * 带结果返回失败
     * @param httpStatus http 请求错误状态码{@link Response.Status}
     * @param busiStatus 业务状态码{@link ResponseObj.Status}
     * @param data 数据
     * @return
     */
    public static Response failure(Response.Status httpStatus, ResponseObj.Status busiStatus, Object data) {
        ResponseObj obj = new ResponseObj(busiStatus, data);
        return Response.status(httpStatus).entity(obj).build();
    }

    /**
     * 待结果返回失败
     * @param busiStatus 业务状态码{@link ResponseObj.Status}
     * @param data 数据
     * @return
     */
    public static Response failure(ResponseObj.Status busiStatus, Object data) {
        return failure(Response.Status.INTERNAL_SERVER_ERROR, busiStatus, data);
    }

    /**
     * 返回失败
     * @param busiStatus 业务状态码
     * @return
     */
    public static Response failure(ResponseObj.Status busiStatus) { return failure(busiStatus, new Object()); }

    /**
     * 返回失败
     * @return
     */
    public static Response failure() { return failure(ResponseObj.Status.FAIL); }
}
