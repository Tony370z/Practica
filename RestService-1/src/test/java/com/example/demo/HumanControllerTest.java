package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controller.HumanController;
import com.example.demo.service.HumanService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HumanControllerTest {
	
	@Mock
	HumanService service;
	
	@InjectMocks
	HumanController controller;
	
	MockMvc mvc;
	
	@Before
	public void setup() {
        MockitoAnnotations.initMocks(this);

        mvc = MockMvcBuilders.standaloneSetup(controller).build();
    }
	
	@Test
	public void contextLoads() throws Exception{
		mvc.perform(get("/get")).andExpect(status().isOk());
	}

}
