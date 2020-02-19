package com.example.k8sexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class K8sexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sexampleApplication.class, args);
	}

}
