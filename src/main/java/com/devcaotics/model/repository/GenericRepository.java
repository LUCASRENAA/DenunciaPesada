/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.repository;

import java.sql.SQLException;
import java.util.List;

import com.devcaotics.model.entities.Estudante;
import com.devcaotics.model.entities.Ocorrencia;
import com.devcaotics.model.entities.Professor;

/**
 *
 * @author ALUNO
 */
public interface GenericRepository<T, I> {
    
    public void create(T t);
    public void update(T t);
    public T read(T t);
    public void delete(I i);
    public List<T> readAll();
	int lastId();
	Estudante readCodigo(String i);
	Professor readProfessor(String i);
	Ocorrencia read_integer(Integer i);
    public List<T> filtro(Professor professor) throws SQLException;
	public List<Ocorrencia> filtro2(Estudante estudante) throws SQLException;

}
