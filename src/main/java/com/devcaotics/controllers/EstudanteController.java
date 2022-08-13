package com.devcaotics.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devcaotics.model.entities.Estudante;
import com.devcaotics.model.entities.ResultadoDoBicho;
import com.devcaotics.model.repository.Facade;

@Controller
public class EstudanteController {
	
	@RequestMapping("/estudantes")
	public String index(Model m) {
		List<Estudante> estudantes = Facade.getCurrentInstance().readAllEstudantes();
		
		m.addAttribute("estudantes",estudantes);
		return "estudante/visualizar";
		
	}
	
	
	@RequestMapping("/estudante/cadastro")
	public String cadastro(Model m, Estudante c) {
		
		Facade.getCurrentInstance().createEstudante(c);
				
		return "index";
		
	}
	
	@RequestMapping("/estudante/cadastrar")
	public String cadastro3(Model m) {
		
	
		
		return "estudante/cadastro";
		
	}
	
	

	

}
