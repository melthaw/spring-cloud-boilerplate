package io.picos.scb.sample;

import io.picos.scb.sample.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
@EnableEurekaClient
@EnableAsync
public class OpenApiApplication  {

    @Bean
    public EurekaRestController eurekaRestController() {
        return new EurekaRestController();
    }

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{OpenApiApplication.class}, args);
    }

}
