/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class InitConnection {
    
       String url = "jdbc:mysql://localhost/dbexam";
       String user = "root";
       String password = "";
       
       Connection con = null;
         
       public InitConnection(){    
    	   try {
    		  Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection(url, user, password);
    	   }catch(Exception e) {}

       }
       
    public Connection getConnection(){
        return con;
    }   
}