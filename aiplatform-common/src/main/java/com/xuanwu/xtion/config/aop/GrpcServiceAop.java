package com.xuanwu.xtion.config.aop;

import com.xuanwu.xtion.helper.CommonException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
public class GrpcServiceAop {

    private Logger logger;

    public GrpcServiceAop setLogger(Logger logger) { this.logger = logger; return this; }

    @Around("execution(* com.xuanwu.xtion.*..rest..*.*(..))")
    public void invoke(ProceedingJoinPoint proceedingJoinPoint) {
        assert logger != null;
        System.out.println("request is {}");
        try {
            proceedingJoinPoint.proceed();
        } catch (CommonException e) {

        } catch (Throwable throwable) {

        }
    }
}
