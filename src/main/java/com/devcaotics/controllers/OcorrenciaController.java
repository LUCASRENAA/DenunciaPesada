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
	
		return "ocorrencia/cadastro";
		
	}
	
	@RequestMapping("/ocorrencia/cadastro/submit")
	public String fazPedido(Model m, Ocorrencia p, Estudante x, Professor c, String matricula,String codigo) {
			
		p.setEstudante(Facade.getCurrentInstance().readCodigo(matricula));
		p.setProfessor(Facade.getCurrentInstance().readProfessor(codigo));
		Facade.getCurrentInstance().createOcorrencia(p);
		m.addAttribute("msg6","Pedido realizado sucesso!");
		
		List <Ocorrencia> pedidos = Facade.getCurrentInstance().readAllOcorrencias();
		m.addAttribute("pedido", pedidos);
		
	return "cliente/visualizarPedidos";
	}	

}
