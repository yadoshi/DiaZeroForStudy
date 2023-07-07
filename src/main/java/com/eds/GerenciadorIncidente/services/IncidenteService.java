package com.eds.GerenciadorIncidente.services;

import java.util.List;
import java.util.Optional;

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
	
	public Incidente findById(Integer id) {
		Optional<Incidente> obj = repository.findById(id);
		return obj.get();
	}
	
	public Incidente Insert(Incidente obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
