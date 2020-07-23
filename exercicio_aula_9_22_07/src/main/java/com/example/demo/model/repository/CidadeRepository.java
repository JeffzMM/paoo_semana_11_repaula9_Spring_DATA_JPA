package com.example.demo.model.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.bean.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	public Cidade findByLatitudeAndLongitude(int latitude, int longitude);
	
	public List <Cidade> findByNome (String nome);
	
	public List <Cidade> findByNomeIgnoreCase (String nome);
	
	
			

}
