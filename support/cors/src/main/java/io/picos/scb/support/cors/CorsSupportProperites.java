package io.picos.scb.support.cors;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <code>
 * corsConfiguration.setAllowCredentials(true);
 * corsConfiguration.addAllowedOrigin("http://localhost:8090");
 * corsConfiguration.addAllowedHeader("*");
 * corsConfiguration.addAllowedMethod("*");
 * </code>
 *
 * @author dz
 */
@ConfigurationProperties(prefix = "io.picos.scb.support.cors")
public class CorsSupportProperites {

    private boolean allowCredentials = true;

    private String allowOrigin = "*";

    private String allowHeader = "*";

    private String allowMethod = "*";

    public boolean isAllowCredentials() {
        return allowCredentials;
    }

    public void setAllowCredentials(boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    public String getAllowOrigin() {
        return allowOrigin;
    }

    public void setAllowOrigin(String allowOrigin) {
        this.allowOrigin = allowOrigin;
    }

    public String getAllowHeader() {
        return allowHeader;
    }

    public void setAllowHeader(String allowHeader) {
        this.allowHeader = allowHeader;
    }

    public String getAllowMethod() {
        return allowMethod;
    }

    public void setAllowMethod(String allowMethod) {
        this.allowMethod = allowMethod;
    }
}
