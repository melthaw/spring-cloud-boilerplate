package io.picos.scb.discovery.eureka.core;

/**
 * @author dz
 */
public enum RegisterMode {

    /**
     * The eureka classic mode without any enhancement
     */
    CLASSIC,

    /**
     * Allow the client registered even the client is not defined in the allowed list.
     */
    FREE_REGION,

    /**
     * Only the client defined in the allowed list can be registered into the forced region.
     */
    FORCED_REGION,

}
