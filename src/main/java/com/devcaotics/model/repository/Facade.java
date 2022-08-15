/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.repository;


import com.devcaotics.model.entities.Estudante;
import com.devcaotics.model.entities.Ocorrencia;
import com.devcaotics.model.entities.Professor;

import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Facade {
    
    private static Facade myself = null;
    
    private GenericRepository<Estudante, String> rEstudante = null; 
    private GenericRepository<Professor, String> rProfessor = null; 
    private GenericRepository<Ocorrencia, String> rOcorrencia = null; 


    private Facade(){
        
    	this.rEstudante = new EstudanteRepository();
    	this.rProfessor = new ProfessorRepository();
    	this.rOcorrencia = new OcorrenciaRepository();


    }
    
    public static Facade getCurrentInstance(){
        
        if(myself == null){
            myself = new Facade();
        }
        
        return myself;
        
    }
    

    public void createEstudante(Estudante c){
        this.rEstudante.create(c);
    }

    public void createOcorrencia(Ocorrencia c){
        this.rOcorrencia.create(c);
    }
    public void createProfessor(Professor c){
        this.rProfessor.create(c);
    }
    

    
    //public ResultadoDoBicho readResultado(int id){
    	
       //return this.rResultado.read(id);
    //}
    
    //public void deleteResultado(int id){
        //this.rResultado.delete(id);
    //}
    

    public List<Estudante> readAllEstudantes(){
        return this.rEstudante.readAll();
    }
    
    public List<Professor> readAllProfessores(){
        return this.rProfessor.readAll();
    }

    
    public List<Ocorrencia> readAllOcorrencias(){
        return this.rOcorrencia.readAll();
    }
 
 
	public Estudante readCodigo(String matricula) {
		// TODO Auto-generated method stub
        return this.rEstudante.readCodigo(matricula);
	}
	
	public void deleteEstudante(String matricula) {
		// TODO Auto-generated method stub
       this.rEstudante.delete(matricula);
	}
	
	
	public void deleteOcorrencia(String id) {
		// TODO Auto-generated method stub
       this.rOcorrencia.delete(id);
	}
	
	public void deleteProfessor(String codigo) {
		// TODO Auto-generated method stub
       this.rProfessor.delete(codigo);
	}
	
	

	   public void updateEstudante(Estudante c){
	        this.rEstudante.update(c);
	    }
	   public void updateProfessor(Professor c){
	        this.rProfessor.update(c);
	    }

	public Professor readProfessor(String codigo) {
		// TODO Auto-generated method stub
        return this.rProfessor.readProfessor(codigo);
	}



        
    
    
}
