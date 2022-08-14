/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.repository;

import com.devcaotics.model.dao.ConnectionManager;
import com.devcaotics.model.entities.Estudante;
import com.devcaotics.model.entities.Ocorrencia;
import com.devcaotics.model.entities.Professor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUNO
 */
public class OcorrenciaRepository implements GenericRepository<Ocorrencia, String>{

    @Override
    public void create(Ocorrencia t) {
        
        String sql = "insert into ocorrencia(data, local, descricao, "
                + "infoAdicional,codigoProfessor,matriculaEstudante) values (?,?,?,?,?,?)";
        
        try {
            PreparedStatement pstm = ConnectionManager.getCurrentConnection()
                    .prepareStatement(sql);
            
            pstm.setString(1, t.getData());
            pstm.setString(2, t.getLocal());
            pstm.setString(3, t.getDescricao());
            pstm.setString(4, t.getInfoAdicional());
            
            pstm.setString(5, t.getEstudante().getMatricula());
            pstm.setString(6, t.getProfessor().getCodigo());
            
            pstm.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(OcorrenciaRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OcorrenciaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(Ocorrencia t) {
        String sql = "update set Ocorrencia(local = ?, descricao = ?, "
                + "infoAdicional = ?) where id = ? ";
        
        try {
            PreparedStatement pstm = ConnectionManager.getCurrentConnection()
                    .prepareStatement(sql);
            
            pstm.setString(1, t.getLocal());
            pstm.setString(2, t.getDescricao());
            pstm.setString(3, t.getInfoAdicional());
            
            pstm.setLong(4, t.getId());
            
            pstm.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(OcorrenciaRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OcorrenciaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Ocorrencia read_integer(Integer i) {
        String sql = "select * from ocorrencia as o join professor as p join estudante as e "
                + "on (o.matriculaEstudante = e.matricula and o.codigoProfessor = p.codigo) where Ocorrencia = ?";
        
        try {
            PreparedStatement pstm = ConnectionManager.getCurrentConnection()
                    .prepareStatement(sql);
            
            pstm.setInt(1, i);
            
            ResultSet r = pstm.executeQuery();
            
            if(r.next()){
                
                Estudante c = new Estudante();
                c.setMatricula(r.getString("matricula"));
                c.setNome(r.getString("nome"));
                c.setCurso(r.getString("curso"));
                c.setAnoEntrada(r.getInt("anoEntrada"));
                
                Professor m = new Professor();
                m.setCodigo(r.getString("codigo"));
                m.setNome(r.getString("nome"));
                m.setCurso(r.getString("curso"));
                m.setMateriaLecionada(r.getString("materiaLecionada"));

                Ocorrencia v = new Ocorrencia();
                
                v.setData(r.getString("data"));
                v.setLocal(r.getString("local"));
                v.setDescricao(r.getString("descricao"));
                v.setInfoAdicional(r.getString("infoAdicional"));
               
                
                v.setEstudante(c);
                v.setProfessor(m);
                
                return v;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(OcorrenciaRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OcorrenciaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

  
    @Override
    public List<Ocorrencia> readAll() {
        
        String sql = "select * from ocorrencia";
        
        List<Ocorrencia> viagens = new ArrayList<>();
        
        try {
            
            PreparedStatement pstm = ConnectionManager.getCurrentConnection()
                    .prepareStatement(sql);
            
            ResultSet r = pstm.executeQuery();
            
            while(r.next()){
                
                Ocorrencia v = new Ocorrencia();
                v.setId(r.getInt("id"));

                v.setData(r.getString("data"));
                v.setLocal(r.getString("local"));
                v.setDescricao(r.getString("descricao"));
                v.setInfoAdicional(r.getString("infoAdicional"));
                
                String sql2 = "select * from estudante where matricula = ?";
                
                PreparedStatement pstm2 = ConnectionManager.getCurrentConnection()
                    .prepareStatement(sql2);
                System.out.println(r.getString("matriculaEstudante"));
                pstm2.setString(1, r.getString("matriculaEstudante"));
                
                ResultSet r2 = pstm2.executeQuery();
                
                if(r2.next()){
                    Estudante c = new Estudante();
                    c.setMatricula(r2.getString("matricula"));

                    c.setNome(r2.getString("nome"));
                    c.setCurso(r2.getString("curso"));
                    c.setAnoEntrada(r2.getInt("anoEntrada"));
                    System.out.println("será que chego aqui?");

                    v.setEstudante(c);
                    
                }
                
                String sql3 = "select * from professor where codigo = ?";
                
                PreparedStatement pstm3 = ConnectionManager.getCurrentConnection()
                    .prepareStatement(sql3);
                
                pstm3.setString(1, r.getString("codigoProfessor"));
                
                ResultSet r3 = pstm3.executeQuery();
                
                if(r3.next()){
                    Professor m = new Professor();
                    
                    m.setCodigo(r3.getString("codigo"));
                    m.setNome(r3.getString("nome"));
                    m.setCurso(r3.getString("curso"));
                    m.setMateriaLecionada(r3.getString("materiaLecionada"));

                    
                    v.setProfessor(m);
                    
                }
                
                viagens.add(v);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(OcorrenciaRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OcorrenciaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return viagens;
    }

	

	public Ocorrencia read(Ocorrencia t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Estudante readCodigo(String i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor readProfessor(String i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String i) {
		// TODO Auto-generated method stub
		
	}
    
}
