package com.stresstest.apirest_beac.dto;


public class ScenarioDTO {
    
    private String libelle;
    private String statut;
    private String anneeReference;
    private String commentaire;
    private String typeScenario;
    private ParametreDTO[] parametres;
    
    
    public ScenarioDTO() {
    }

    public ScenarioDTO(String libelle, String statut, String anneeReference, String commentaire, String typeScenario) {
        this.libelle = libelle;
        this.statut = statut;
        this.anneeReference = anneeReference;
        this.commentaire = commentaire;
        this.typeScenario = typeScenario;
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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getTypeScenario() {
        return typeScenario;
    }

    public void setTypeScenario(String typeScenario) {
        this.typeScenario = typeScenario;
    }

    public ParametreDTO[] getParametres() {
        return parametres;
    }

    public void setParametres(ParametreDTO[] parametres) {
        this.parametres = parametres;
    }

    
}
