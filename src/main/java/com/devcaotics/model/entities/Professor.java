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
public class Professor {
    private String codigo;
    private String nome;
    private String curso;
    private String materiaLecionada;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getMateriaLecionada() {
		return materiaLecionada;
	}
	public void setMateriaLecionada(String materiaLecionada) {
		this.materiaLecionada = materiaLecionada;
	}

    
}
