package com.github.sronlemos.carrinhoapi.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.sronlemos.carrinhoapi.rest.dto.ClienteDTO;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<ClienteDTO> findAll() {
		List<ClienteDTO> clientes = new ArrayList<>();
		clientes.add(new ClienteDTO(1l, "Joao"));
		return clientes;
	}
}
