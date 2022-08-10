package com.bsoft.namegeneratorservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NameGeneratorService {

	public static void main(String[] args) {
		SpringApplication.run(NameGeneratorService.class, args);
	}

}
