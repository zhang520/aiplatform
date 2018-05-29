package com.xuanwu.xtion;

import com.xuanwu.xtion.config.aop.RestServiceAop;
import com.xuanwu.xtion.config.jersey.JerseyConfig;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

    @Bean
    public JerseyConfig initJerseyConfig() {
        return new JerseyConfig().packages("com.xuanwu.xtion.task.rest");
    }

    @Bean
    public RestServiceAop initRestServiceAop() { return new RestServiceAop(); }

    public static void main(String... arg) { SpringApplication.run(Application.class, arg); }
}
