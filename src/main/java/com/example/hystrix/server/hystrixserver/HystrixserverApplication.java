package com.example.hystrix.server.hystrixserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.hystrix.server.hystrixserver"})
@EnableAutoConfiguration
public class HystrixserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixserverApplication.class, args);
	}

}
