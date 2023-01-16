package com.ssg.sausageeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SausageEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SausageEurekaServerApplication.class, args);
    }

}
