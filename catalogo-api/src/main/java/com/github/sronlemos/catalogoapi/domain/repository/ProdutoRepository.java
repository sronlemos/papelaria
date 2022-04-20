package com.github.sronlemos.catalogoapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.sronlemos.catalogoapi.domain.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
