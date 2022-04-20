package com.github.sronlemos.catalogoapi.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.sronlemos.catalogoapi.domain.entity.Produto;

@RestController
public class ProdutoController {
	
	@Autowired
	private Environment environment;

	@GetMapping("/produtos")
	public List<Produto> findAll() {
		
		String porta = environment.getProperty("local.server.port");
		System.out.println(porta);
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1l, "descricao"));
		return produtos;
	}

	@GetMapping("/produtos/{id}")
	public List<Produto> findById(@PathVariable("id") Long id) {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(id, "descricao"));
		return produtos;
	}

}
