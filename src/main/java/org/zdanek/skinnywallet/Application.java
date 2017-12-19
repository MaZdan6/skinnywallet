package org.zdanek.skinnywallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import configuration.SwaggerConfig;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableAutoConfiguration
@EnableSwagger2 //enables Swagger 2 support by registering certain beans into the Spring application context
//@Import(SwaggerConfig.class)//contains the Swagger UI that displays the Swagger documentation at http://localhost:8080/swagger-ui.html
@Import(SpringDataRestConfiguration.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
