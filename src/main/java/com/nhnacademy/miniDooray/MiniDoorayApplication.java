package com.nhnacademy.miniDooray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MiniDoorayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniDoorayApplication.class, args);
	}

}
