package com.ecommerce.ecomconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EcomconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomconfigserverApplication.class, args);
	}

}
