package com.api.interview.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class InterviewQuestionnaireApplication  {

	public static void main(String[] args) {
		SpringApplication.run(InterviewQuestionnaireApplication.class, args);
	}
	
}