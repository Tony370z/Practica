package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Human;

@Service
public class HumanServiceImpl implements HumanService{

	@Override
	public Human get() {
		Human human = new Human();
		return human;
//		un comentario
	}
	
	public void prueba() {
		
	}
	
}
