package com.fideljose.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {      
	
	 @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.fideljose.controller"))  
          .paths(PathSelectors.any())                       
          .build()
          .apiInfo(metaInfo());                                           
    }
//	 @Bean
//    public Docket api() { 
//        return new Docket(DocumentationType.SWAGGER_2)  
//          .select()                                  
//          .apis(RequestHandlerSelectors.basePackage("com.fideljose.otherController"))
//          .paths(PathSelectors.any())                       
//          .build();                                           
//    }

	private ApiInfo metaInfo() {
		@SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo(
			"title1",
			"description2",
			"version3",
			"https://www.programcreek.com/java-api-examples/?api=springfox.documentation.builders.PathSelectors",
			"Contacto: Fidel Jose Villero",
			"license6",
			"http://127.0.0.1:49811/browser/"
		);
		return apiInfo;
	}
}
