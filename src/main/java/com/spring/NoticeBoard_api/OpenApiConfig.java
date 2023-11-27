package com.spring.NoticeBoard_api;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("API Document")
                .version("v0.0.1")
                .description("API 명세서");
        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}
