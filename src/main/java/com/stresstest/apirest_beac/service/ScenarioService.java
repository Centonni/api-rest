package com.stresstest.apirest_beac.service;

import java.util.List;

import com.stresstest.apirest_beac.modele.Scenario;

public interface ScenarioService {
	Scenario creer(Scenario scenario);
	List<Scenario> lire();
	Scenario modifier (Long id, Scenario scenario);
	String supprimer(Long id);

}
