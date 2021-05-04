package com.paulo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
