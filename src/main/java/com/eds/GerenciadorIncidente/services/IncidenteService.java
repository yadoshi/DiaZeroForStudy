package com.eds.GerenciadorIncidente.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eds.GerenciadorIncidente.entities.Incidente;
import com.eds.GerenciadorIncidente.repositories.IncidenteRepository;
import com.eds.GerenciadorIncidente.services.exceptions.ResourceNotFoundException;

@Service
public class IncidenteService {

	@Autowired
	private IncidenteRepository repository;
	
	public List<Incidente> findALL(){
		return repository.findAll();
	}
	
	public Incidente findById(Integer id) {
		Optional<Incidente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Incidente Insert(Incidente obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	public Incidente update(Integer id, Incidente obj) {
		Incidente entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Incidente entity, Incidente obj) {
		entity.setName(obj.getName());
		entity.setDescription_incident(obj.getDescription_incident());
		entity.setUpdated_at(obj.getUpdated_at());
		entity.setClosed_at(obj.getClosed_at());
	}
}
