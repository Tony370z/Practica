package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Human;

@Service
public class HumanServiceImpl implements HumanService{

	@Override
	public Human get() {
		Human human = new Human();
		human.setAge("26");
		human.setName("Tony");
		human.setLastName("Morantes");
		return human;
	}
	
}
