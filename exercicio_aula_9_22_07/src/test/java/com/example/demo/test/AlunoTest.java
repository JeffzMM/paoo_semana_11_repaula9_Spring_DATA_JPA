package com.example.demo.test;


import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.bean.Cidade;
import com.example.demo.model.repository.CidadeRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class AlunoTest {
	
	@Autowired
	private CidadeRepository alunoRepository;
	
	@Test
	public void testInsertCidade () {
		Cidade a = new Cidade();
		a.setNome("Murumbi");
		a.setLatitude(10);
		a.setLongitude(20);
		a = alunoRepository.save(a);
		System.out.println(a.getId());
				
	}

	@Test
	public void testBuscaPorId() {
		
		Optional <Cidade>  a = alunoRepository.findById(1L);
		System.out.println(a.get());
		
	}
	
	
	@Test
	public void testQuantidade () {
		System.out.println(alunoRepository.count());
	}
	
	
}
