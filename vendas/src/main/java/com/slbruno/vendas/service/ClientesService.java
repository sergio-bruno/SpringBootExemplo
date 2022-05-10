package com.slbruno.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slbruno.vendas.repository.ClientesRepository;

@Service
public class ClientesService {

	@Autowired
	private ClientesRepository repositorio;
	
}
