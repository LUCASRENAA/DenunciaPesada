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

public class ProfessorRepository implements GenericRepository<Professor, String> {

	@Override
	public void create(Professor t) {
		 String sql = "insert into professor(codigo,nome,curso,materiaLecionada) values(?,?,?,?)";
	        
	        
	        
	        try {
	            
	            PreparedStatement pstm = com.devcaotics.model.
	                dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
	            pstm.setString(1, t.getCodigo());
	            pstm.setString(2, t.getNome());
	            pstm.setString(3, t.getCurso());
	            pstm.setString(4, t.getMateriaLecionada());

	    

	            pstm.execute();
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(ProfessorRepository.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(ProfessorRepository.class.getName()).log(Level.SEVERE, null, ex);
	        }		
	}





	@Override
	public void delete(String i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Professor> readAll() {
		// TODO Auto-generated method stub
		  String sql = "select * from professor";
	        
	        List<Professor> Professors = new ArrayList<>();
	        
	        try {
	            
	            PreparedStatement pstm = com.devcaotics.model.
	                    dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
	            
	            ResultSet result = pstm.executeQuery();
	            
	            
	            
	           while(result.next()){
	        	   Professor c =  new Professor();
	                c.setCodigo(result.getString("codigo"));
	                c.setNome(result.getString("nome"));
	                c.setCurso(result.getString("curso"));
	                c.setMateriaLecionada(result.getString("materiaLecionada"));


	                Professors.add(c);
	            }
	            
	            
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(ProfessorRepository.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(ProfessorRepository.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        return Professors;
	        
	        
	 

	}

	    public Professor readProfessor(String i) {
	        
	        String sql = "select * from professor where codigo=?";
	        
	        try {
	            
	            PreparedStatement pstm = com.devcaotics.model.
	                    dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
	            
	            pstm.setString(1, i);
	            
	            ResultSet result = pstm.executeQuery();
	            
	            if(result.next()){
	            	Professor c =  new Professor();
	                c.setCodigo(i);
	                c.setNome(result.getString("nome"));
	                c.setCurso(result.getString("curso"));
	                c.setMateriaLecionada(result.getString("materiaLecionada"));

	                return c;
	            }
	            
	            
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(ProfessorRepository.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(ProfessorRepository.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        return null;
	    }

	@Override
	public Professor read(Professor t) {
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
	public void update(Professor t) {
		// TODO Auto-generated method stub
		
	}

	 


}
