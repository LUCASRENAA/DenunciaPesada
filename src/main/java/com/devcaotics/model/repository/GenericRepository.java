/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.repository;

import java.util.List;

import com.devcaotics.model.entities.ResultadoDoBicho;

/**
 *
 * @author ALUNO
 */
public interface GenericRepository<T, I> {
    
    public void create(T t);
    public void update(T t);
    public T read(int id);
    public void delete(I i);
    public List<T> readAll();
	int lastId();
    
}
