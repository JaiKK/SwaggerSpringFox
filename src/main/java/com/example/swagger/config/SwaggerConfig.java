package com.example.swagger.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket CompleteAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.swagger"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "Swagger Example", 
	      "This is simple discription.", 
	      "Version", 
	      "Terms of service", 
	      new Contact("Jai", "www.example.com", "jai@company.com"), 
	      "License of API", "API license URL", Collections.emptyList());
	}
	
}
