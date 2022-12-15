package com.stresstest.apirest_beac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stresstest.apirest_beac.modele.Scenario;
// Cette classe est notre repository, autrement dit notre DAO, c'est la couche persistance
@Repository
public interface ScenarioRepository extends JpaRepository<Scenario, Long>{
	

}
