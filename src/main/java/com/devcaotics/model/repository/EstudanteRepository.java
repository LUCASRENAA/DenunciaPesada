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

public class EstudanteRepository implements GenericRepository<Estudante, String> {

	@Override
	public void create(Estudante t) {
		 String sql = "insert into estudante(matricula,nome,curso,anoEntrada) values(?,?,?,?)";
	        
	        
	        
	        try {
	            
	            PreparedStatement pstm = com.devcaotics.model.
	                dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
	            pstm.setString(1, t.getMatricula());
	            pstm.setString(2, t.getNome());
	            pstm.setString(3, t.getCurso());

	            pstm.setInt(4, t.getAnoEntrada());
	    

	            pstm.execute();
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(EstudanteRepository.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(EstudanteRepository.class.getName()).log(Level.SEVERE, null, ex);
	        }		
	}

	public void update(Estudante t) {
		String sql = "update estudante set nome=? ,curso=? ,anoEntrada=?"
                + " where matricula=? ";
        
        
        
        try {
            
            PreparedStatement pstm = com.devcaotics.model.
                dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
            
            //pstm.setString(1, t.getMatricula());
            pstm.setString(1, t.getNome());
            pstm.setString(2, t.getCurso());
            
            pstm.setInt(3, t.getAnoEntrada());
            pstm.setString(4, t.getMatricula());
            System.out.println("teste");
            System.out.println( t.getMatricula());
            System.out.println( t);
            	
            int rows = pstm.executeUpdate();
            pstm.close();
            System.out.println(rows);
        } catch (SQLException ex) {
            Logger.getLogger(EstudanteRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstudanteRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}



	@Override
	public void delete(String i) {
		 String sql = "delete from estudante where matricula = ?;";
			System.out.println(sql);
			System.out.println(i);

	        try {
	            
	            PreparedStatement pstm = com.devcaotics.model.
	                    dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
				System.out.println("alo");

	            pstm.setString(1, i);
				System.out.println("alo2");

				int rowCount = pstm.executeUpdate();
				 
				System.out
						.println("Record Deleted successfully from database. Row Count returned is :: "
								+ rowCount);				System.out.println("teste");

	            
	        }
		  
		  catch (SQLException ex) {
	            Logger.getLogger(sql);
				System.out.println(sql);

	        } catch (ClassNotFoundException ex) {
				System.out.println("a");

	            Logger.getLogger(sql);
	        }
		  
	}

	@Override
	public List<Estudante> readAll() {
		// TODO Auto-generated method stub
		  String sql = "select * from estudante";
	        
	        List<Estudante> estudantes = new ArrayList<>();
	        
	        try {
	            
	            PreparedStatement pstm = com.devcaotics.model.
	                    dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
	            
	            ResultSet result = pstm.executeQuery();
	            
	            
	            
	           while(result.next()){
	        	   Estudante c =  new Estudante();
	                c.setMatricula(result.getString("matricula"));
	                c.setNome(result.getString("nome"));
	                c.setCurso(result.getString("curso"));
	           
	                c.setAnoEntrada(result.getInt("anoEntrada"));

	                estudantes.add(c);
	            }
	            
	            
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(EstudanteRepository.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(EstudanteRepository.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        return estudantes;
	        
	        
	 

	}

	    public Estudante readCodigo(String i) {
	        
	        String sql = "select * from estudante where matricula=?";
	        
	        try {
	            
	            PreparedStatement pstm = com.devcaotics.model.
	                    dao.ConnectionManager.getCurrentConnection().prepareStatement(sql);
	            
	            pstm.setString(1, i);
	            
	            ResultSet result = pstm.executeQuery();
	            
	            if(result.next()){
	            	Estudante c =  new Estudante();
	                c.setMatricula(i);
	                c.setNome(result.getString("nome"));
	                c.setCurso(result.getString("curso"));
	                c.setAnoEntrada(result.getInt("anoEntrada"));
	                System.out.println("alo2");
	                return c;
	            }
	            
	            
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(EstudanteRepository.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(EstudanteRepository.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        return null;
	    }

	@Override
	public Estudante read(Estudante t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Professor readProfessor(String i) {
		// TODO Auto-generated method stub
		return null;
	}

	

	 


}
