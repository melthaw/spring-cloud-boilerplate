package io.picos.scb.discovery.eureka.service;

import io.picos.scb.discovery.eureka.core.Client;
import io.picos.scb.discovery.eureka.core.RegisterMode;

/**
 * The enhanced eureka service :
 * <p>
 * <ul>
 * <li>The supported register mode</li>
 * <li></li>
 * <li></li>
 * <li></li>
 * </ul>
 *
 * @author dz
 */
public interface EnhancedEurekaService {

    RegisterMode getSupportedMode();

    Client[] listClients();

    Client findClientByName(String name);

}
