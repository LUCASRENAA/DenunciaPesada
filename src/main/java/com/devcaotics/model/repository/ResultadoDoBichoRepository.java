package com.devcaotics.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.devcaotics.model.entities.Estudante;
import com.devcaotics.model.entities.Professor;
import com.devcaotics.model.entities.ResultadoDoBicho;

public class ResultadoDoBichoRepository implements GenericRepository<ResultadoDoBicho, String> {

	@Override
	public void create(ResultadoDoBicho t) {
		 String sql = "insert into resultado(resultado1,resultado2,resultado3,resultado4,resultado5) values(?,?,?,?,?)";
	        
	        
	        
	        try {
	            
	            PreparedStatement pstm = com.devcaotics.model.
	                dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
	            pstm.setInt(1, t.getResultado1());
	            pstm.setInt(2, t.getResultado2());
	            pstm.setInt(3, t.getResultado3());
	            pstm.setInt(4, t.getResultado4());
	            pstm.setInt(5, t.getResultado5());

	            pstm.execute();
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(ResultadoDoBichoRepository.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(ResultadoDoBichoRepository.class.getName()).log(Level.SEVERE, null, ex);
	        }		
	}




	@Override
	public void delete(String i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ResultadoDoBicho> readAll() {
		// TODO Auto-generated method stub
		  String sql = "select * from resultado";
	        
	        List<ResultadoDoBicho> carros = new ArrayList<>();
	        
	        try {
	            
	            PreparedStatement pstm = com.devcaotics.model.
	                    dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
	            
	            ResultSet result = pstm.executeQuery();
	            
	            
	            
	           while(result.next()){
	        	   ResultadoDoBicho c =  new ResultadoDoBicho();
	                c.setId(result.getInt("id"));

	                c.setResultado1(result.getInt("resultado1"));
	                c.setResultado2(result.getInt("resultado2"));
	                c.setResultado3(result.getInt("resultado3"));
	                c.setResultado4(result.getInt("resultado4"));
	                c.setResultado5(result.getInt("resultado5"));

	                carros.add(c);
	            }
	            
	            
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(ResultadoDoBichoRepository.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(ResultadoDoBichoRepository.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        return carros;
	        
	        
	 

	}

	 @Override
	    public ResultadoDoBicho read(ResultadoDoBicho t) {
	        
	        
	        return null;
	    }

	 
	 @Override
		public int lastId() {
			// TODO Auto-generated method stub
			  String sql = "select * from resultado";
			  int lastId = 0;
		        
		        List<ResultadoDoBicho> carros = new ArrayList<>();
		        
		        try {
		            
		            PreparedStatement pstm = com.devcaotics.model.
		                    dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
		            
		            ResultSet result = pstm.executeQuery();
		            
		            
		            
		           while(result.next()){
		        	   ResultadoDoBicho c =  new ResultadoDoBicho();
		                c.setId(result.getInt("id"));
		                lastId = result.getInt("id");
		                
		                

		                c.setResultado1(result.getInt("resultado1"));
		                c.setResultado2(result.getInt("resultado2"));
		                c.setResultado3(result.getInt("resultado3"));
		                c.setResultado4(result.getInt("resultado4"));
		                c.setResultado5(result.getInt("resultado5"));

		                carros.add(c);
		            }
		            
		            
		            
		        } catch (SQLException ex) {
		            Logger.getLogger(ResultadoDoBichoRepository.class.getName()).log(Level.SEVERE, null, ex);
		        } catch (ClassNotFoundException ex) {
		            Logger.getLogger(ResultadoDoBichoRepository.class.getName()).log(Level.SEVERE, null, ex);
		        }
		        
		        return lastId;
		        
		        
		 

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
	public void update(ResultadoDoBicho t) {
		// TODO Auto-generated method stub
		
	}


}
