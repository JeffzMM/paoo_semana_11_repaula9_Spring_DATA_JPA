package com.example.demo.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.bean.Cidade;
import com.example.demo.model.repository.CidadeRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class AlunoQueryTest {
	
	@Autowired
	private CidadeRepository repo;
	
	@Test
	public void testFindByLatitudeLongitude () {
		Cidade a = repo.findByLatitudeAndLongitude(10, 20);
		System.out.println(a);
	}
	
	@Test
	public void testFindByName () {
		System.out.println(repo.findByNome("Murumbi"));
	}
	
	@Test
	public void testFindByNameIgnoringCase () {
		System.out.println(repo.findByNomeIgnoreCase("Murumbi"));
	}
	
	

}
