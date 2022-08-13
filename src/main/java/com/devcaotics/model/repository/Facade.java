/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.repository;


import com.devcaotics.model.entities.ResultadoDoBicho;

import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Facade {
    
    private static Facade myself = null;
    
    private GenericRepository<ResultadoDoBicho, String> rResultado = null; 


    private Facade(){
        
    	this.rResultado = new ResultadoDoBichoRepository();
    	

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

    
 public int lastId(){
    	
        return this.rResultado.lastId();
     }
 
 
    public ResultadoDoBicho read(int id){
    	
        return this.rResultado.read(id);
     }



        
    
    
}
