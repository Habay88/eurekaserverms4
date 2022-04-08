package com.habay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Termii2Application {

	public static void main(String[] args) {
		SpringApplication.run(Termii2Application.class, args);
	}

}
