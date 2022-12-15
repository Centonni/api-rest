package com.stresstest.apirest_beac.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="PARAMETRE")
public class Parametre implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length=150)
	private String libelle;
	
	public Parametre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Parametre(long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	

}
