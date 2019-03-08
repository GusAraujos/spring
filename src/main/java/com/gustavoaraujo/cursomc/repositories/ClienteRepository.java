package com.gustavoaraujo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavoaraujo.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
