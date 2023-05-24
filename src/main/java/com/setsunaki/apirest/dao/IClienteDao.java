package com.setsunaki.apirest.dao;

import com.setsunaki.apirest.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
}
