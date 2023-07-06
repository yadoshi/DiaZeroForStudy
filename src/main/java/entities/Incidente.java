package entities;

import java.util.Date;

public class Incidente {

	
	private String name;
	private Integer id_incident;
	private String description_incident;
	private Date creat_at;
	private Date update_at;
	private Date closed_at;
	
	public Incidente(){
	}
	
	public Incidente(String name, Integer id_incident, String description_incident, Date creat_at, Date update_at,
			Date closed_at) {
		this.name = name;
		this.id_incident = id_incident;
		this.description_incident = description_incident;
		this.creat_at = creat_at;
		this.update_at = update_at;
		this.closed_at = closed_at;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId_incident() {
		return id_incident;
	}

	public void setId_incident(Integer id_incident) {
		this.id_incident = id_incident;
	}

	public String getDescription_incident() {
		return description_incident;
	}

	public void setDescription_incident(String description_incident) {
		this.description_incident = description_incident;
	}

	public Date getCreat_at() {
		return creat_at;
	}

	public void setCreat_at(Date creat_at) {
		this.creat_at = creat_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public Date getClosed_at() {
		return closed_at;
	}

	public void setClosed_at(Date closed_at) {
		this.closed_at = closed_at;
	}
	
}
