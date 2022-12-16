package com.stresstest.apirest_beac.dto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.stresstest.apirest_beac.modele.Scenario;


public class ScenarioDTO {
    
    private Long id;
    private String libelle;
    private String statut;
    private String anneeReference;
    private String commentaire;
    private String typeScenario;
    private String dateCreation;
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

    public static Scenario dtoToScenario (ScenarioDTO dto) throws ParseException{
        Scenario scenario = new Scenario();
        scenario.setAnneeReference(dto.anneeReference);
        scenario.setContenu(dto.commentaire);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        Date convertedDate = dateFormat.parse(dto.dateCreation);
        scenario.setDateCreation( convertedDate);
        scenario.setLibelle(dto.libelle);
        scenario.setStatut(dto.statut);
        scenario.setId(dto.getId());
        return scenario;
    }

    public static ScenarioDTO scenarioToDTO (Scenario scenario) throws ParseException{
        ScenarioDTO dto = new ScenarioDTO();
        dto.setAnneeReference(scenario.getAnneeReference());
        dto.setCommentaire(scenario.getContenu());

        dto.setDateCreation( scenario.getDateCreation().toString());
        dto.setLibelle(scenario.getLibelle());
        dto.setStatut(scenario.getStatut());
        dto.setId(scenario.getId());
        return dto;
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

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
