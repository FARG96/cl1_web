package com.computadoras.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_areas")
public class Area {

	@Column(name = "id_area")
	private int id_area;
	
	@Column(name = "nom_area")
	private String nom_area;
	
	@Column(name = "cant_clien_area")
	private int cant_clien_area;
	
	
	// Métodos getter y setter de área
	public int getId_area() {
		return id_area;
	}
	public void setId_area(int id_area) {
		this.id_area = id_area;
	}
	public String getNom_area() {
		return nom_area;
	}
	public void setNom_area(String nom_area) {
		this.nom_area = nom_area;
	}
	public int getCant_clien_area() {
		return cant_clien_area;
	}
	public void setCant_clien_area(int cant_clien_area) {
		this.cant_clien_area = cant_clien_area;
	}
	
	
}
