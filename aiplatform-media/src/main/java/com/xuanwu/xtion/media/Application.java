package com.xuanwu.xtion.media;

import com.xuanwu.xtion.config.aop.GrpcServiceAop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

    @Bean
    public GrpcServiceAop initGrpcServiceAop() { return new GrpcServiceAop(); }

    public static void main(String... args) { SpringApplication.run(Application.class, args); }

}
