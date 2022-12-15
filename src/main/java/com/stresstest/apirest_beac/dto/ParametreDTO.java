package com.stresstest.apirest_beac.dto;

import lombok.Getter;
import lombok.Setter;


public class ParametreDTO {
    public Long id;
    public String annee1;
    public String annee2;
    public String annee3;

    public ParametreDTO(Long id, String annee1, String annee2, String annee3){
        this.id = id;
        this.annee1 = annee1;
        this.annee2 = annee2;
        this.annee3 = annee3;
    }

    
    public ParametreDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnnee1() {
        return annee1;
    }

    public void setAnnee1(String annee1) {
        this.annee1 = annee1;
    }

    public String getAnnee2() {
        return annee2;
    }

    public void setAnnee2(String annee2) {
        this.annee2 = annee2;
    }

    public String getAnnee3() {
        return annee3;
    }

    public void setAnnee3(String annee3) {
        this.annee3 = annee3;
    }


}
