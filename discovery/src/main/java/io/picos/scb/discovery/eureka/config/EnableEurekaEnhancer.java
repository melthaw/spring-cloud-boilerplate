package io.picos.scb.discovery.eureka.config;

import io.picos.scb.discovery.eureka.core.RegisterMode;

import java.lang.annotation.*;

/**
 * @author dz
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableEurekaEnhancer {

    RegisterMode mode() default RegisterMode.FORCED_REGION;

}
