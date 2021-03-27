package tp_dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDAO extends DAO<Person> {
	
    public PersonDAO(Connection conn) {
        super(conn);
    }

  

    public void create(Person person) {
    	
    	int num = person.getNum();
		String nom = person.getNom();
		String prenom = person.getPrenom();
		
		
		try {
			Statement st= super.connect.createStatement();
			st.executeUpdate("insert into person(num,nom,prenom) values(" + num + ",'" +nom + "','" + prenom + "')");

		}catch(Exception e) {
			
			
		}
    	

    }

     public void delete(Person person) {
    	 
     	int num = person.getNum();
 		try {
			Statement st= super.connect.createStatement();
			st.executeUpdate("delete from person where num =" + num);

		}catch(Exception e) {
			
			
		}
     }

     public void update(Person person) {
    	 
     	int num = person.getNum();
 		String nom = person.getNom();
 		String prenom = person.getPrenom();
 		
 		
		try {
			Statement st= super.connect.createStatement();
			st.executeUpdate("update person set nom = '" + nom+ "',prenom = '" +prenom+"' where num ="+num);

		}catch(Exception e) {
			
			
		}
 		
 		
 		
    	 
     }

     public Person find(int num) { 
  		String nom = "nom";
  		String prenom = "prenom";
  		
 		try {
 		Statement st= super.connect.createStatement();
 		ResultSet res = st.executeQuery("select * from preson where num="+num);
 		
 		while(res.next()) {
 			nom = res.getString("nom");
 			System.out.println("nom  " + nom);
 			prenom = res.getString("prenom");
 			
 		}
 			

 		}catch(Exception e) {
 			
 			
 		}
    	 
    	 
    	 return new Person(num,nom,prenom);
    	 }


}
