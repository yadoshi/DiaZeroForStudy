package com.eds.GerenciadorIncidente.entities;

import java.util.Objects;

import com.eds.GerenciadorIncidente.Enums.Status;
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
	private String created_at;
	private String updated_at;
	private String closed_at;

	private String status;

	public Incidente(){
	}
	
	public Incidente(Integer id_incident, String name, String description_incident, String created_at, String updated_at,
			String closed_at, String status) {
		this.id_incident = id_incident;
		this.name = name;
		this.description_incident = description_incident;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.closed_at = closed_at;
		this.status = status;
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

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getClosed_at() {
		return closed_at;
	}

	public void setClosed_at(String closed_at) {
		this.closed_at = closed_at;
	}

	public String getStatus(){ return status;}

	public void setStatus(String status){this.status = status;}


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
