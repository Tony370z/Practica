package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Human;

@Service
public class HumanServiceImpl implements HumanService{

	@Override
	public Human get() {
		Human human = new Human();
		human.setAge("28");
		human.setName("Edgard");
		human.setAddress("Carabobo, Venezuela");
		return human;
//		un comentario
	}
	
	public void prueba() {
	// metodo de prueba	
	}
	
}
