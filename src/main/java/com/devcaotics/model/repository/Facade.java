/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.repository;


import com.devcaotics.model.entities.Estudante;
import com.devcaotics.model.entities.Professor;
import com.devcaotics.model.entities.ResultadoDoBicho;

import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Facade {
    
    private static Facade myself = null;
    
    private GenericRepository<ResultadoDoBicho, String> rResultado = null; 
    private GenericRepository<Estudante, String> rEstudante = null; 
    private GenericRepository<Professor, String> rProfessor = null; 


    private Facade(){
        
    	this.rResultado = new ResultadoDoBichoRepository();
    	this.rEstudante = new EstudanteRepository();
    	this.rProfessor = new ProfessorRepository();


    }
    
    public static Facade getCurrentInstance(){
        
        if(myself == null){
            myself = new Facade();
        }
        
        return myself;
        
    }
    
    public void create(ResultadoDoBicho c){
        this.rResultado.create(c);
    }
   
    public void createEstudante(Estudante c){
        this.rEstudante.create(c);
    }
    
    public void createProfessor(Professor c){
        this.rProfessor.create(c);
    }
    
    public void update(ResultadoDoBicho c){
        this.rResultado.update(c);
    }
    
    //public ResultadoDoBicho readResultado(int id){
    	
       //return this.rResultado.read(id);
    //}
    
    //public void deleteResultado(int id){
        //this.rResultado.delete(id);
    //}
    
    public List<ResultadoDoBicho> readAll(){
        return this.rResultado.readAll();
    }

    public List<Estudante> readAllEstudantes(){
        return this.rEstudante.readAll();
    }
    
    public List<Professor> readAllProfessores(){
        return this.rProfessor.readAll();
    }
 public int lastId(){
    	
        return this.rResultado.lastId();
     }
 
 
    public ResultadoDoBicho read(int id){
    	
        return this.rResultado.read(id);
     }



        
    
    
}
