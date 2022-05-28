package com.github.sronlemos.carrinhoapi.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
public class TesteProdutoController {

	private Logger logger = LoggerFactory.getLogger(TesteProdutoController.class);

	@GetMapping("/produtos")
//	@Retry(name = "default", fallbackMethod = "fallbackMethod")
//	@CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")
//	@RateLimiter(name = "default")
	@Bulkhead(name = "default")
	public String produto() {
		logger.info("Requisicao TesteProdutoController foi recebida!");
//		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/falha", String.class);
//		return forEntity.getBody();
		return "produto teswt";
	}

	public String fallbackMethod(Exception ex) {
		return "fallbackMethod teste";
	}

}
