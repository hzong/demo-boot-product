package com.example.hz.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
//@EnableDiscoveryClient
public class DemoSpringBootProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootProductApplication.class, args);
    }

}
