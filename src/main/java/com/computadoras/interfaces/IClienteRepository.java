package com.computadoras.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.computadoras.model.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, String> {

}
