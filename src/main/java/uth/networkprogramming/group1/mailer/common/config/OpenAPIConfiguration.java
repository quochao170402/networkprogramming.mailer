package uth.networkprogramming.group1.mailer.common.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {
    @Bean
    public OpenAPI getOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("UTH - Network Programming - Group 1 - Send Bulk Emails")
                        .description("Service for Education Purpose")
                        .version("v1.0")
                        .license(new License().name("NO LICENSE").url("https://github.com/quochao170402"))
                        .contact(new Contact()
                                .email("2051120111@ut.edu.vn")
                                .name("Group 1")
                                .url("https://github.com/quochao170402")))
                .externalDocs(new ExternalDocumentation()
                        .description("Spring Documentation")
                        .url("https://docs.spring.io/spring-framework/docs/current/reference/html/"));
    }


}
