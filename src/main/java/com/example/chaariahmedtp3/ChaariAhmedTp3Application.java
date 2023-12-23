package com.example.chaariahmedtp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChaariAhmedTp3Application {
	@Bean
	public org.springframework.web.client.RestTemplate restTemplate() {
		return new org.springframework.web.client.RestTemplate();
	}


		public static void main(String[] args) {
		SpringApplication.run(ChaariAhmedTp3Application.class, args);
	}

}
