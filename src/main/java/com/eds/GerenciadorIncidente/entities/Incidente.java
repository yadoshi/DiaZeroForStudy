package com.eds.GerenciadorIncidente.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_incidente")
public class Incidente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_incident;
	private String name;
	private String description_incident;
	private String creat_at;
	private String update_at;
	private String closed_at;
	
	public Incidente(){
	}
	
	public Incidente(Integer id_incident, String name, String description_incident, String creat_at, String update_at,
			String closed_at) {
		this.id_incident = id_incident;
		this.name = name;
		this.description_incident = description_incident;
		this.creat_at = creat_at;
		this.update_at = update_at;
		this.closed_at = closed_at;
	}

	public Integer getId_incident() {
		return id_incident;
	}

	public void setId_incident(Integer id_incident) {
		this.id_incident = id_incident;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription_incident() {
		return description_incident;
	}

	public void setDescription_incident(String description_incident) {
		this.description_incident = description_incident;
	}

	public String getCreat_at() {
		return creat_at;
	}

	public void setCreat_at(String creat_at) {
		this.creat_at = creat_at;
	}

	public String getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}

	public String getClosed_at() {
		return closed_at;
	}

	public void setClosed_at(String closed_at) {
		this.closed_at = closed_at;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_incident);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidente other = (Incidente) obj;
		return Objects.equals(id_incident, other.id_incident);
	}
	
	
}
