package tp_pattern.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import tp_pattern.InitConnection;
import tp_pattern.obj.Langage;

public class LangDao implements IDao<Langage>{
	
	InitConnection init = null;

	@Override
	public void updateOne(Langage lang) {
		String id = lang.getId();
		String nom = lang.getNom();
        try {
            init = new InitConnection();
            Connection con = init.getConnection();
            Statement statement = con.createStatement();
            
            ResultSet res = statement.executeQuery("select * from langage where id ="+id);
            
            if(! res.next() ) {
            	System.out.println("You are trying to update unexisted langage, back off !");
            }else {
            	statement.executeUpdate("update langage set nom='"+nom+"' where id="+id);
            	System.out.println("Language updated");
            }
        }catch(Exception e) {
        	
        }
	}
	//unused methods
	
	@Override
	public void saveOne(Langage o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Langage getOne(Langage id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Langage> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
