package com.stresstest.apirest_beac.controller;

import java.util.List;

import com.stresstest.apirest_beac.modele.Scenario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stresstest.apirest_beac.repository.BanqueRepository;
import com.stresstest.apirest_beac.modele.Banque;

@RestController
@RequestMapping("/banque")
@CrossOrigin(origins = {"*","http://localhost:4200"}, allowedHeaders = "*")
public class BanqueController {
	
	@Autowired
	private BanqueRepository banqueRepository;
	
	@GetMapping("/banques")
	public List<Banque> getAllBanques(){
		return banqueRepository.findAll();
	}

	@PostMapping("/banques-create")
	public Banque createBanque(@RequestBody Banque scenario) {
		return banqueRepository.save(scenario);
	}

	@DeleteMapping("/banques-delete/{id}")
	public ResponseEntity<Void> createBanque(@PathVariable long id) {
		 banqueRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
