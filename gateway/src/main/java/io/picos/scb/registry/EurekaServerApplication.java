package io.picos.scb.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Import;

/**
 * @author dz
 */
@SpringBootApplication
@EnableAutoConfiguration//(exclude = SecurityAutoConfiguration.class)
@EnableEurekaServer
@Import({WebMvcConfigurer.class})
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
