package io.picos.scb.support.cors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * refer to : http://spring.io/blog/2015/06/08/cors-support-in-spring-framework
 *
 * @author dz
 */
@Configuration
@EnableConfigurationProperties(CorsSupportProperites.class)
public class CorsSupportConfiguraton {

    @Autowired
    private CorsSupportProperites corsSupportProperites;

    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        final CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(corsSupportProperites.isAllowCredentials());
        corsConfiguration.addAllowedOrigin(corsSupportProperites.getAllowOrigin());
        corsConfiguration.addAllowedHeader(corsSupportProperites.getAllowHeader());
        corsConfiguration.addAllowedMethod(corsSupportProperites.getAllowMethod());
        corsConfiguration.setMaxAge(18000L);// 预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了

        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }

}
