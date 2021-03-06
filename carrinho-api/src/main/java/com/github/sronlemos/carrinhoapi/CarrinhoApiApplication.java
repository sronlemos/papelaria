package com.github.sronlemos.carrinhoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CarrinhoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrinhoApiApplication.class, args);
	}

}
