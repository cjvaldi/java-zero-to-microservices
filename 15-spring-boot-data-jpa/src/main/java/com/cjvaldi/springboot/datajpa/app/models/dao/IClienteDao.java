package com.cjvaldi.springboot.datajpa.app.models.dao;

import com.cjvaldi.springboot.datajpa.app.models.entities.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long>, PagingAndSortingRepository<Cliente, Long> {

	
}
