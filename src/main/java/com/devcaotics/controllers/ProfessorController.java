package com.devcaotics.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devcaotics.model.entities.Estudante;
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
	
	@RequestMapping("/professor/editar/{codigo}")
	public String visualiza(Model m, @PathVariable("codigo") String codigo) {
		
		Professor c = Facade.getCurrentInstance().readProfessor(codigo);
		
		m.addAttribute("estudante", c);
		
		return "professor/editar";
		
	}
	
	@RequestMapping("/professor/ver/{codigo}")
	public String visualiza2(Model m, @PathVariable("codigo") String codigo) {
		
		Professor c = Facade.getCurrentInstance().readProfessor(codigo);
		
		m.addAttribute("estudante", c);
		
		return "professor/visualizar1";
		
	}
	
	
	@RequestMapping("/professor/excluir/{codigo}")
	public String visualiza3(Model m, Professor s,@PathVariable("codigo") String codigo) {
		
		Facade.getCurrentInstance().deleteProfessor(codigo);
		
		System.out.println(codigo);
		return "index";
		
	}
	
	
	
	@RequestMapping("/professor/editar/{codigo}/submit")
	public String visualiza4(Model m,Professor e , @PathVariable("codigo") String codigo) {
		
		Facade.getCurrentInstance().updateProfessor(e);
		
		System.out.println(codigo);
		return "index";
		
	}
	
	

	

}
