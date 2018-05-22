package com.xuanwu.xtion.config.aop;

import com.xuanwu.xtion.rest.helper.CommonException;
import com.xuanwu.xtion.rest.helper.ResponseObj;
import com.xuanwu.xtion.rest.helper.RestHelper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
@Aspect
public class RestServiceAop {

    private Logger logger = LoggerFactory.getLogger(RestServiceAop.class);

    public RestServiceAop setLogger(Logger logger) { this.logger = logger; return this; }

    public RestServiceAop() { System.out.print("xxxx"); }

    @Around("execution(* com.xuanwu.xtion.*..rest..*.*(..))")
    public Object invoke(ProceedingJoinPoint proceedingJoinPoint) {
        assert logger != null;
        System.out.println("request is {}");
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
