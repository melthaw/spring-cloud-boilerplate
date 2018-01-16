package io.picos.scb.discovery.eureka.core;

/**
 * The fire wall which allow the client to register or not
 *
 * @author dz
 */
public interface FireWall {

    /**
     * @param request
     * @return true if the request is allowed to register
     * false otherwise
     */
    boolean isAllowed(RegisterRequest request);

}
