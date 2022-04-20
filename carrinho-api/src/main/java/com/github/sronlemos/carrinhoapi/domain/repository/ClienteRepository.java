package com.github.sronlemos.carrinhoapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.sronlemos.carrinhoapi.domain.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
