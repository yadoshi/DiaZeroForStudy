package com.eds.GerenciadorIncidente.dao;

import com.eds.GerenciadorIncidente.entities.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenteDao extends JpaRepository<Incidente, Integer> {
}
