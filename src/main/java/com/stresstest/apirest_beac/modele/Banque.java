package com.stresstest.apirest_beac.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="BANQUE")
public class Banque implements Serializable{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	@Column(length=50)
	private String code;
	@Column(length=100)
	private String libelle;
	
	public Banque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banque(long id, String code, String libelle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	
	

}
