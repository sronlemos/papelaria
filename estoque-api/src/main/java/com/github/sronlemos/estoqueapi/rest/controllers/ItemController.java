package com.github.sronlemos.estoqueapi.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.sronlemos.estoqueapi.config.ItemConfiguration;
import com.github.sronlemos.estoqueapi.rest.dto.ItemDTO;

@RestController
public class ItemController {

	@Autowired
	private ItemConfiguration itemConfiguration;

	@GetMapping("/itens")
	public List<ItemDTO> findAll() {
		List<ItemDTO> itens = new ArrayList<>();
		itens.add(new ItemDTO(1l, "teste"));
		return itens;

	}

	@GetMapping("/itens/{id}")
	public List<ItemDTO> findById(@PathVariable Long id) {
		List<ItemDTO> itens = new ArrayList<>();
		itens.add(new ItemDTO(id, itemConfiguration.getDefaultValue()));
		return itens;

	}

}
