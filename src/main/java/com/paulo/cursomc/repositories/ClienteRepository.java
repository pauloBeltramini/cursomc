package com.paulo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
