package com.github.sronlemos.carrinhoapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.sronlemos.carrinhoapi.rest.dto.ProdutoDTO;

@Service
public class ProdutoService {

	
	public List<ProdutoDTO> findAll(){
		
		List<ProdutoDTO> produtos = new RestTemplate().getForObject("http://localhost:8000/produtos", List.class);
		
		return produtos;
	}
}
