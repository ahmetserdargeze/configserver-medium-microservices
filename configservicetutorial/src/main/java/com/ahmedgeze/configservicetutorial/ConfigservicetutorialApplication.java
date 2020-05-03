package com.ahmedgeze.configservicetutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigservicetutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigservicetutorialApplication.class, args);
	}

}
