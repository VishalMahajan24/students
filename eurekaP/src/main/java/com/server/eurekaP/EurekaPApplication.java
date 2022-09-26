package com.server.eurekaP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaPApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPApplication.class, args);
	}

}
