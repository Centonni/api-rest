package com.stresstest.apirest_beac.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stresstest.apirest_beac.dto.ScenarioDTO;
import com.stresstest.apirest_beac.exception.RessourceNotFoundException;
import com.stresstest.apirest_beac.modele.Scenario;
import com.stresstest.apirest_beac.modele.TypeScenario;
import com.stresstest.apirest_beac.repository.ScenarioRepository;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/scenario")
@CrossOrigin(origins = {"*","http://localhost:4200"}, allowedHeaders = "*")
@Slf4j
public class ScenarioController {
	
	private final ScenarioRepository scenarioRepository;
	private final String pythonServiceEndpoint;

	private final RestTemplate restTemplate;

	public ScenarioController(ScenarioRepository scenarioRepository,
							  @Value("${beac.scenario.python.ms.endpoint}") String pythonServiceEndpoint,
							  RestTemplateBuilder templateBuilder) {
		this.scenarioRepository = scenarioRepository;
		this.pythonServiceEndpoint = pythonServiceEndpoint;
		this.restTemplate=templateBuilder.build();
	}

	// get all scenarios api
	@GetMapping("/scenarios")
	public List<Scenario> getAllScenarios(){
		return scenarioRepository.findAll();
	}
	@GetMapping("/typeScenarios")
	public List<TypeScenario> getAllTypesScenarios(){
		return Arrays.asList(TypeScenario.values());  
	}
	//create scenario
	@PostMapping("/create")
	public Scenario createScenario( @RequestBody ScenarioDTO scenario) {
		//return scenarioRepository.save(scenario);
		return new Scenario();
	}
	
	//get scenario by id
	@GetMapping("scenario/{id}")
	public ResponseEntity<Scenario> getScenarioById(@PathVariable(value = "id") long scenarioId) 
			throws RessourceNotFoundException{
				Scenario scenario = scenarioRepository.findById(scenarioId)
						.orElseThrow(()-> new RessourceNotFoundException("Scenario not found for this id ::" + scenarioId));
				return ResponseEntity.ok().body(scenario);
	}
	
	// update scenario
	@PutMapping("updateScenario/{id}")
	public ResponseEntity<Scenario> updateScenario(@PathVariable(value = "id") long scenarioId,
			@RequestBody Scenario  scenarioDetails) throws RessourceNotFoundException{
		Scenario scenario = scenarioRepository.findById(scenarioId)
				.orElseThrow(()-> new RessourceNotFoundException("Scenario not found for this id ::" + scenarioId));
		scenario.setAnneeReference(scenarioDetails.getAnneeReference());
		scenario.setContenu(scenarioDetails.getContenu());
		scenario.setDateCreation(scenarioDetails.getDateCreation());
		scenario.setLibelle(scenarioDetails.getLibelle());
		scenario.setStatut(scenarioDetails.getStatut());
		
		return ResponseEntity.ok().body(scenario);
	} 
	
	// launch scenario
		@PutMapping("launchScenario/{id}")
		public ResponseEntity<String> launchScenario(@PathVariable(value = "id") long scenarioId) throws RessourceNotFoundException{
			Scenario scenario = scenarioRepository.findById(scenarioId)
					.orElseThrow(()-> new RessourceNotFoundException("Scenario not found for this id ::" + scenarioId));

			var headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			var request =new HttpEntity(scenario, headers);

			ResponseEntity<String> response = restTemplate.postForEntity(pythonServiceEndpoint, request, String.class);

			log.info("Retour appel ms py {}",response);

			if (response.getStatusCode().is2xxSuccessful()){

				scenario.setStatut("IN_PROGRESS");
				scenarioRepository.save(scenario);

				return ResponseEntity.ok("Scenario en cours de stress test");

			}

			return ResponseEntity.unprocessableEntity().body("Impossible de lancer le scenario pour le moment stress test");


		}
		
		
	// delete scenario
	@DeleteMapping("deleteScenario/{id}")
	public ResponseEntity<?> deleteScenario(@PathVariable(value = "id") long scenarioId) throws RessourceNotFoundException {
		 scenarioRepository.findById(scenarioId)
				.orElseThrow(()-> new RessourceNotFoundException("Scenario not found for this id ::" + scenarioId));
		
		scenarioRepository.deleteById(scenarioId);
		return  ResponseEntity.ok().build();
	}
	/*private final ScenarioService scenarioService;
	
	
	public ScenarioController(ScenarioService scenarioService) {
		super();
		this.scenarioService = scenarioService;
	}

	@PostMapping("/create")
	public Scenario create(@RequestBody Scenario scenario) {
		return scenarioServi
	}
	
	@GetMapping("/read")
	public List<Scenario> read(){
		return scenarioService.lire();
	}
	
	@PutMapping("/update/{id}")
	public Scenario update(@PathVariable Long id, @RequestBody Scenario scenario) {
		return scenarioService.modifier(id, scenario);
	}
	
	@DeleteMapping("/delete")
	String delete(@PathVariable Long id) {
		return scenarioService.supprimer(id);
	}
	*/

}
