# SwaggerSpringFox

* [Homepage](http://springfox.github.io/springfox/)
* [github page](https://github.com/springfox/springfox)
* [Tutorial page1](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)
* [Tutorial page2](https://dzone.com/articles/spring-boot-2-restful-api-documentation-with-swagg)
* [Video Tutorial](https://www.youtube.com/watch?v=HHyjWc0ASl8)


To enable swagger documentation we need 2 main dependencies one swagger core and another viewing it in browser.

```xml
<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.8.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.8.0</version>
</dependency>
```


- Configuring Swagger 2 in the Application

Create a configuration class 'SwaggerConfig' and annotate it with '@EnableSwagger2'.
This class returns a Docket object which contains configuration and metadata information for Swagger2.

```java
package com.example.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket CompleteAPI() {
		return new Docket(DocumentationType.SWAGGER_2);
	}
	
}

```


