package io.picos.scb.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
@EnableEurekaClient
@EnableAsync
public class OpenApiSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{OpenApiSampleApplication.class}, args);
    }

}
