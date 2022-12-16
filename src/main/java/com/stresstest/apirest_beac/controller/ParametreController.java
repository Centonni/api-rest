package com.stresstest.apirest_beac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stresstest.apirest_beac.modele.Parametre;
import com.stresstest.apirest_beac.repository.ParametreRepository;

@RestController
@RequestMapping("/parametre")
@CrossOrigin(origins = {"*","http://localhost:4200"}, allowedHeaders = "*")
public class ParametreController {
	
	@Autowired
	private ParametreRepository parametreRepository;
	
	@GetMapping("/parametres")
	public List<Parametre> getAllParametres(){
		return parametreRepository.findAll();
		
	}

	@PostMapping("/parametres-create")
	public Parametre createParametres(@RequestBody Parametre parametre){
		return parametreRepository.save(parametre);

	}
}
