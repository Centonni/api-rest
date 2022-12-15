package com.stresstest.apirest_beac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stresstest.apirest_beac.exception.RessourceNotFoundException;
import com.stresstest.apirest_beac.modele.ResultatScenario;
import com.stresstest.apirest_beac.repository.ResultatScenarioRepository;

@RestController
@RequestMapping("/resultatScenario")
public class ResultatScenarioController {
	
	@Autowired
	ResultatScenarioRepository resultatScenarioRepository;
	
	/*
	@GetMapping("resultat/{id}")
	public  ResponseEntity<ResultatScenario> getResultatScenarioByScenarioId(@PathVariable(value = "id")long scenarioId) 
			throws RessourceNotFoundException{
		
					ResultatScenario resultatScenario = resultatScenarioRepository.findById(scenarioId)
							.orElseThrow(()-> new RessourceNotFoundException("Resultat not found for the scenario id ::" + scenarioId));
		
		return ResponseEntity.ok().body(resultatScenario);
	} 
	*/

}
