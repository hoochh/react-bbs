package com.bitc.big403.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/**") // /ajax/** 접속 주소가 ajax 이하 모든 경로 해당
//		.allowedOriginPatterns("http://localhost:3000");
//		//.allowedOriginPatterns("http://localhost:8080"); //경로 추가 가능
	}
}
