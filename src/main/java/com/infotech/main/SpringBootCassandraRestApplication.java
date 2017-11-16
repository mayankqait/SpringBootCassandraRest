package com.infotech.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.infotech")
public class SpringBootCassandraRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCassandraRestApplication.class, args);
	}
}
