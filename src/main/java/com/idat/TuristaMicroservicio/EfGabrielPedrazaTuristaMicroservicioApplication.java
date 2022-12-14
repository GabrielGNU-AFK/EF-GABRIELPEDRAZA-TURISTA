package com.idat.TuristaMicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfGabrielPedrazaTuristaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfGabrielPedrazaTuristaMicroservicioApplication.class, args);
	}

}
