package com.engobytes.cocoo.noteskeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NotesKeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesKeeperApplication.class, args);
	}

}
