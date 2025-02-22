package com.example.messagingapp.UC1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class MessagingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingappApplication.class, args);
	}

}
