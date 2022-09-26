package com.service.studentsP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentsPApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsPApplication.class, args);
	}

}
