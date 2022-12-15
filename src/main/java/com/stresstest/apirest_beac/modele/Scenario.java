package com.stresstest.apirest_beac.modele;


import java.io.Serializable;
import java.time.Year;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //permet que la classe soit mappée avec une table au niveau de la BDD
@Table(name ="SCENARIO") //l'annotation Table permet de donner le nom de la table qui sera créé dans BDD
//@Getter // utilisation de Lombok, ici nous lui disons de générer tous les getters.
//@Setter // Lombok va nous générer tous les setters
//@AllArgsConstructor //Lombok va générer le constructeur avec tous les arguments.
//@NoArgsConstructor //Lombok constructeur sans argument.

public class Scenario implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // la strategie identité permet d'incrémenter la génération auto incrémenter de l'ID.
	@Column(name="scen_id")
	private long id;
	Date dateCreation;
	@Column(length=50)
	String libelle;
	@Column(length=50)
	String statut;
	String anneeReference;
	@Column(length=150)
	String contenu;
	@Column
	@Enumerated
	TypeScenario type;
	
	public Scenario() {
		super(); 
		this.type = TypeScenario.BASE; 
		this.dateCreation = new Date();
		// TODO Auto-generated constructor stub
	}

	public Scenario(long id, Date dateCreation, String libelle, String statut, Year anneeReference, String contenu) {
		this.id = id;
		if(dateCreation == null)
			this.dateCreation = new Date();
		else
			this.dateCreation = dateCreation;
		
		this.libelle = libelle;
		this.statut = statut;
		this.contenu = contenu;
		this.type = TypeScenario.CATASTROPHE;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getAnneeReference() {
		return anneeReference;
	}

	public void setAnneeReference(String anneeReference) {
		this.anneeReference = anneeReference;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	public TypeScenario getType() {
		return type;
	}

	public void setType(TypeScenario type) {
		this.type = type;
	}
	

}
