package com.eds.GerenciadorIncidente.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eds.GerenciadorIncidente.entities.Incidente;
import com.eds.GerenciadorIncidente.services.IncidenteService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/incidentes")
public class IncidenteResource {
	
	@Autowired
	private IncidenteService service;
	
	
	@GetMapping
	public ResponseEntity<List<Incidente>> findALL(){
		List<Incidente> list = service.findALL();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Incidente> findById(@PathVariable Integer id){
		Incidente obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
