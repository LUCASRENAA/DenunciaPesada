package com.devcaotics.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devcaotics.model.entities.Estudante;
import com.devcaotics.model.entities.Ocorrencia;
import com.devcaotics.model.entities.Professor;
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
	
	@RequestMapping("/ocorrencia/cadastro")
	public String cadastroocorrencia(Model m) {
	
List<Estudante> estudantes = Facade.getCurrentInstance().readAllEstudantes();
		
		m.addAttribute("estudantes",estudantes);
		
List<Professor> professores = Facade.getCurrentInstance().readAllProfessores();
		
		m.addAttribute("professores",professores);
		return "ocorrencia/cadastro";
		
	}
	
	@RequestMapping("/ocorrencia/cadastro/submit")
	public String fazPedido(Model m, Ocorrencia p, Estudante x, Professor c, String matricula,String codigo) {
			System.out.println(matricula);
		p.setEstudante(Facade.getCurrentInstance().readCodigo(matricula));
		p.setProfessor(Facade.getCurrentInstance().readProfessor(codigo));
		Facade.getCurrentInstance().createOcorrencia(p);
		m.addAttribute("msg6","Pedido realizado sucesso!");
		
		List <Ocorrencia> pedidos = Facade.getCurrentInstance().readAllOcorrencias();
		m.addAttribute("pedido", pedidos);
		
	return "home";
	}	
	
	
	@RequestMapping("/ocorrencia/excluir/{matricula}")
	public String visualiza3(Model m, @PathVariable("matricula") String id) {
		
		Facade.getCurrentInstance().deleteOcorrencia(id);
		
		System.out.println(id);
		return "index";
		
	}
	

}
