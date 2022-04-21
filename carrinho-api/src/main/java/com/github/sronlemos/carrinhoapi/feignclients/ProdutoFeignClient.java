package com.github.sronlemos.carrinhoapi.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.sronlemos.carrinhoapi.rest.dto.ProdutoDTO;

@Component
@FeignClient(value = "catalogo-api", url = "http://localhost:8000")
public interface ProdutoFeignClient {

	@GetMapping("/produtos")
	public List<ProdutoDTO> findAll();

}
