package com.deepoove.dubbo.provider.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>@description:</p>
 *
 * @author shuang.yang
 * @version 1.0
 * @date 2020/9/15 15:08
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {







    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)
                .allowCredentials(true);
    }
}
