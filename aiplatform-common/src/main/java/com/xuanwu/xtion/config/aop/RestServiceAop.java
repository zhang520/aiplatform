package com.xuanwu.xtion.config.aop;

import com.xuanwu.xtion.helper.CommonException;
import com.xuanwu.xtion.helper.rest.ResponseObj;
import com.xuanwu.xtion.helper.rest.RestHelper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
@Aspect
public class RestServiceAop {

    public RestServiceAop() {}

    @Around("execution(* com.xuanwu.xtion.*..rest..*.*(..))")
    public Object invoke(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            Object ret = proceedingJoinPoint.proceed();
            return ret;
        } catch (CommonException e) {
            return RestHelper.failure(ResponseObj.Status.FAIL, e.getErrorMessage());
        } catch (Throwable throwable) {
            return RestHelper.failure(ResponseObj.Status.ERROR);
        }
    }
}
