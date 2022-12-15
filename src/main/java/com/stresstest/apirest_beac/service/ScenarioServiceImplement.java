/*package com.stresstest.apirest_beac.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.stresstest.apirest_beac.modele.Scenario;
import com.stresstest.apirest_beac.repository.ScenarioRepository;
import com.sun.xml.bind.annotation.OverrideAnnotationOf;

@Service // permet de demander à Spring de considerer cette classe comme contenant du code métier, donc un service.

public class ScenarioServiceImplement implements ScenarioService {
	//Problème avec cette ligne de code "The blank final field scenarioRepository may not have been initialized"
	private final ScenarioRepository scenarioRepository; // une injection par constructeur //final = champ static
	 
	
	public ScenarioServiceImplement(ScenarioRepository scenarioRepository) {
		super();
		this.scenarioRepository = scenarioRepository;
	}
	
	//@Override
	public Scenario creer(Scenario scenario) {
		// TODO Auto-generated method stub
		return scenarioRepository.save(scenario);
	}
	
	//@Override
	public List<Scenario> lire() {
		// TODO Auto-generated method stub
		return scenarioRepository.findAll();
	}
	
	
	//@Override
	public Scenario modifier(Long id, Scenario scenario) {
		// TODO Auto-generated method stub
		return scenarioRepository.findById(id)
				.map(s-> {
					s.setDateCreation(scenario.getDateCreation());
					s.setAnneeReference(scenario.getAnneeReference());
					s.setContenu(scenario.getContenu());
					s.setLibelle(scenario.getLibelle());
					s.setStatut(scenario.getStatut());
					return scenarioRepository.save(s);
				}).orElseThrow(()-> new RuntimeException("Scenario non trouvé !"));
	}
	
	//@Override
	public String supprimer(Long id) {
		scenarioRepository.deleteById(id);
		return "scenario supprimé";
	}
	

}
*/
