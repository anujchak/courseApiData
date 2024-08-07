package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swaggerConfig {
	@Bean
	public Docket getDocket()
	{
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo()).select().build();
	}

	private ApiInfo getApiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder().title("Course Application").description("Build by Anuj").version("1.0").build();
	}
}
