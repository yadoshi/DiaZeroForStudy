package com.eds.GerenciadorIncidente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eds.GerenciadorIncidente.entities.Incidente;

public interface IncidenteRepository extends JpaRepository<Incidente, Integer>{

}
