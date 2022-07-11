package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ms0EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms0EurekaApplication.class, args);
	}
}