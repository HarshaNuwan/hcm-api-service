package edu.bit.hcm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HcmApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcmApiServiceApplication.class, args);
	}

}
