package com.eds.GerenciadorIncidente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eds.GerenciadorIncidente.entities.Incidente;
import com.eds.GerenciadorIncidente.repositories.IncidenteRepository;

@Service
public class IncidenteService {

	@Autowired
	private IncidenteRepository repository;
	
	public List<Incidente> findALL(){
		return repository.findAll();
	}
}
