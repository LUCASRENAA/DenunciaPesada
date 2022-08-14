/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.entities;

/**
 *
 * @author ALUNO
 */
public class Ocorrencia {
    public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Estudante getEstudante() {
		return estudante;
	}
	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getInfoAdicional() {
		return infoAdicional;
	}
	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	private int id;

	private Professor professor;
	private Estudante estudante;
	
    private String local;
    private String descricao;
    private String data;
    private String infoAdicional;


    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	
		    
		    
    
}
}

