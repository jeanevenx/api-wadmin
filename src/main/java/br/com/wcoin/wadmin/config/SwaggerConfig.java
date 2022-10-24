package br.com.wcoin.wadmin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        
        return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("br.com.wcoin.wadmin"))
                    .build()
                    .useDefaultResponseMessages(false)
                    .apiInfo(apiInfo());

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API da plataforma Wadmin")
            .description("API para gerenciar investimentos em criptos")
            .version("1.0.0")
            .license("Apache License Version 2.0")
            .contact(new Contact("Jean Evenx Joseph", 
            		"https://www.linkedin.com/in/jeanevenx/", 
            		"jeanlovenx@gmail.com"))
            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
            .build();
        
    }
    
}
