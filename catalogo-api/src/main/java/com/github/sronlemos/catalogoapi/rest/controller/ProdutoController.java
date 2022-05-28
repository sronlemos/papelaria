package com.github.sronlemos.catalogoapi.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.sronlemos.catalogoapi.domain.entity.Produto;
import com.github.sronlemos.catalogoapi.domain.repository.ProdutoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Produto endpoint")
@RestController
public class ProdutoController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Operation(summary = "listar produtos")
	@GetMapping("/produtos")
	public List<Produto> findAll() {
		
		String porta = environment.getProperty("local.server.port");
		System.out.println(porta);
		return produtoRepository.findAll();
	}

	@Operation(summary = "listar produtos por id")
	@GetMapping("/produtos/{id}")
	public Produto findById(@PathVariable("id") Long id) {
		return produtoRepository.findById(id).get();
	}

}
