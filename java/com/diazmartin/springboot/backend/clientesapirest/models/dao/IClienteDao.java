package com.diazmartin.springboot.backend.clientesapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.diazmartin.springboot.backend.clientesapirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
}
