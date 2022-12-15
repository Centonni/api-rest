package com.stresstest.apirest_beac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stresstest.apirest_beac.repository.BanqueRepository;
import com.stresstest.apirest_beac.modele.Banque;

@RestController
@RequestMapping("/banque")
public class BanqueController {
	
	@Autowired
	private BanqueRepository banqueRepository;
	
	@RequestMapping("/banques")
	public List<Banque> getAllBanques(){
		return banqueRepository.findAll();
		
	}

}
