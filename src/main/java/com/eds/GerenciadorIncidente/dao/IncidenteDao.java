package com.eds.GerenciadorIncidente.dao;

import com.eds.GerenciadorIncidente.entities.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IncidenteDao extends JpaRepository<Incidente, Integer> {

    @Query("select i from Incidente i where i.status = 'Aberto'")
    public List<Incidente> fidByStatusAberto();

    @Query("select i from Incidente i where i.status = 'Fechado'")
    public List<Incidente> fidByStatusFechado();

}
