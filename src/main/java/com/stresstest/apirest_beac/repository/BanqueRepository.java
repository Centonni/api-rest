package com.stresstest.apirest_beac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stresstest.apirest_beac.modele.Banque;
@Repository
public interface BanqueRepository extends JpaRepository<Banque, Long>{

}
