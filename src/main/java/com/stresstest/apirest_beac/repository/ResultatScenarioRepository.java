package com.stresstest.apirest_beac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stresstest.apirest_beac.modele.Parametre;

@Repository
public interface ResultatScenarioRepository extends JpaRepository<Parametre, Long>{

}
