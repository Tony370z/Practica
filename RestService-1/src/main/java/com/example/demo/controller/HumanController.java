package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.HumanService;

@Controller
//@RequestMapping("/human")
public class HumanController {
	
	HumanService human;

	@Autowired
	public void setHuman(HumanService human) {
		this.human = human;
	}
	
	@GetMapping("/get")
	public String getInfo(Model model) {
		model.addAttribute("human", human.get());
		return "human/get";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
