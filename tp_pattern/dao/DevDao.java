package tp_pattern.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import tp_pattern.InitConnection;
import tp_pattern.obj.Developpeur;

public class DevDao implements IDao<Developpeur>{


    @Override
    public Developpeur getOne(Developpeur dev) {
        
        String id =  dev.getId();
        String nom = dev.getNom();
        InitConnection init = null;
       
        try {
            init = new InitConnection();
            Connection con = init.getConnection();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from societe where id =" + id);
            
            if(! rs.next()){
             statement.executeUpdate("insert into societe values ('"+id+"','"+nom+"')");
             System.out.println("Developpeur enregistre");
             con.close();   
        }else{
                
                dev = new Developpeur("", "");
                try {
                     rs = statement.executeQuery("select * from developpeur where id = '"+id+"'");
                    
                    while(rs.next()){//here we are working only on developer id, so we have to base on our database data instead of given developer
                     id = rs.getString("id");
                     nom = rs.getString("nom");
                    dev.setId(id);
                    dev.setNom(nom);
                    
                }
                   return dev;
                } catch (SQLException ex) {
                	
                }
            }        
    }catch(Exception e){}
   return dev; 
}

    @Override
    public ArrayList<Developpeur> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateOne(Developpeur id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void saveOne(Developpeur o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
