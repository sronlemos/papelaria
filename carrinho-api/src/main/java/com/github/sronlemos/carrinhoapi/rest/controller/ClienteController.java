package com.github.sronlemos.carrinhoapi.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.sronlemos.carrinhoapi.domain.entity.Cliente;
import com.github.sronlemos.carrinhoapi.domain.repository.ClienteRepository;
import com.github.sronlemos.carrinhoapi.feignclients.ProdutoFeignClient;
import com.github.sronlemos.carrinhoapi.rest.dto.ClienteDTO;

@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ProdutoFeignClient produtoFeignClient;

	@GetMapping("/clientes")
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@GetMapping("/clientes/{id}/produtos")
	public ClienteDTO listarProdutosDoCliente(@PathVariable("id") Long id) {

		Cliente cliente = clienteRepository.findById(id).get();

		ClienteDTO dto = new ClienteDTO();
		dto.setId(cliente.getId());
		dto.setNome(cliente.getNome());
		dto.setProdutos(produtoFeignClient.findAll());

		return dto;
	}
}
