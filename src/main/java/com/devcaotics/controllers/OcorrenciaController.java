package com.devcaotics.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devcaotics.model.entities.Estudante;
import com.devcaotics.model.entities.Ocorrencia;
import com.devcaotics.model.repository.Facade;

@Controller
public class OcorrenciaController {
	
	
	@RequestMapping("/home")
	public String home(Model m) {
		List<Ocorrencia> estudantes = Facade.getCurrentInstance().readAllOcorrencias();
		
		m.addAttribute("ocorrencias",estudantes);
		System.out.println(estudantes);
		return "home";
		
	}
	
	

}
