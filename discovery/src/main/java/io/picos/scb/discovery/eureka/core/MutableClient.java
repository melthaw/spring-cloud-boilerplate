package io.picos.scb.discovery.eureka.core;

/**
 * @author dz
 */
public interface MutableClient extends Client {

    void setName(String name);

    void setIpAddresses(String[] ipAddresses);

    void setKey(String key);

    void setSecret(String secret);

    void setEnabled(boolean enabled);
}
