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
	@RequestMapping("/estudante/editar/{matricula}")
	public String visualiza(Model m, @PathVariable("matricula") String matricula) {
		
		Estudante c = Facade.getCurrentInstance().readCodigo(matricula);
		
		m.addAttribute("estudante", c);
		
		return "estudante/editar";
		
	}
	
	@RequestMapping("/estudante/ver/{matricula}")
	public String visualiza2(Model m, @PathVariable("matricula") String matricula) {
		
		Estudante c = Facade.getCurrentInstance().readCodigo(matricula);
		
		m.addAttribute("estudante", c);
		
		return "estudante/visualizar1";
		
	}
	
	
	@RequestMapping("/estudante/excluir/{matricula}")
	public String visualiza3(Model m, @PathVariable("matricula") String matricula) {
		
		Facade.getCurrentInstance().deleteEstudante(matricula);
		
		System.out.println(matricula);
		return "index";
		
	}
	
	
	
	@RequestMapping("/estudante/editar/{matricula}/submit")
	public String visualiza4(Model m,Estudante e , @PathVariable("matricula") String matricula) {
		
		Facade.getCurrentInstance().updateEstudante(e);
		
		System.out.println(matricula);
		return "index";
		
	}
	

	

}
