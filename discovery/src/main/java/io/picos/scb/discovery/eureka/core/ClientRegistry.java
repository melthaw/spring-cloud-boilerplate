package io.picos.scb.discovery.eureka.core;

/**
 * @author dz
 */
public interface ClientRegistry {

    RegisterMode getSupportedMode();

    void register(Client client);

    void register(String key, Client client);

    void unregister(Client client);

    Client unregister(String name);

    Client getClient(String name);

    boolean exists(String name);

}
