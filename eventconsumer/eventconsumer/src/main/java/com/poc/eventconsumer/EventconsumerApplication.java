package com.poc.eventconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EventconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventconsumerApplication.class, args);
	}

}
