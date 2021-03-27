/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_pattern.dao;

import java.sql.Connection;
import java.util.ArrayList;

import tp_pattern.InitConnection;
import tp_pattern.obj.Developpeur;
import tp_pattern.obj.Societe;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocieteDao implements IDao<Societe>{

    InitConnection init;
   
    
    @Override   
    public void saveOne(Societe societe) {
          
    	
    	String id = societe.getId();
    	String nom = societe.getNom();
    	
          try {
             init = new InitConnection();
            Connection con = init.getConnection();
            Statement statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery("select * from societe where id =" + id);
            
            if(! rs.next()){
               statement.executeUpdate("insert into societe values ('"+id+"','"+nom+"')");
               System.out.println("Societe enregistre");
                con.close();
            }else{
                System.out.println("Societe existe deja");
            }
            
        } catch (SQLException ex) {}
    }

    
        @Override
    public ArrayList<Societe> getAll() {
        ArrayList<Societe> societes = new ArrayList<>();
         try {
             init = new InitConnection();
            Connection con = init.getConnection();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from societe");
            while(rs.next()){
                String id = rs.getString("id"); 
                String nom = rs.getString("nom");
                societes.add(new  Societe(id, nom));
            		}
            }catch(Exception e){}
         
         return  societes;
    }
      
    @Override
    public Societe getOne(Societe id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void updateOne(Societe id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
