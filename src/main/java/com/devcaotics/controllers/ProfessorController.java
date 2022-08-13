package com.devcaotics.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devcaotics.model.entities.Professor;
import com.devcaotics.model.entities.ResultadoDoBicho;
import com.devcaotics.model.repository.Facade;

@Controller
public class ProfessorController {
	
	@RequestMapping("/professores")
	public String index(Model m) {
		List<Professor> Professores = Facade.getCurrentInstance().readAllProfessores();
		
		m.addAttribute("professores",Professores);
		return "professor/visualizar";
		
	}
	
	
	@RequestMapping("/professor/cadastro")
	public String cadastro(Model m, Professor c) {
		
		Facade.getCurrentInstance().createProfessor(c);
				
		return "index";
		
	}
	
	@RequestMapping("/professor/cadastrar")
	public String cadastro3(Model m) {
		
	
		
		return "professor/cadastro";
		
	}
	
	

	

}
