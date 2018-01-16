package io.picos.scb.discovery.eureka.core;

/**
 * @author dz
 */
public interface RegisterRequest {

    String getIpAddress();

    String getKey();

    String getSecret();

}
