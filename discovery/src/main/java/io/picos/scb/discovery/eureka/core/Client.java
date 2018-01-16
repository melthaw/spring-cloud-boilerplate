package io.picos.scb.discovery.eureka.core;

/**
 * The subscriber defines the allowed attributes.
 *
 * @author dz
 */
public interface Client {

    /**
     * @return The unique key to identity the Client , can't change once it's allocated.
     */
    String getKey();

    /**
     * @return the region name where the micro service will be registered to.
     */
    String getName();

    /**
     * Only the the ip address in the allowed list can be registereed.
     *
     * @return the white ip address list
     */
    String[] getIpAddresses();

    /**
     * @return the secret credential
     */
    String getSecret();

    /**
     * @return false if the client is not allowed to register, otherwise true
     */
    boolean isEnabled();

}
