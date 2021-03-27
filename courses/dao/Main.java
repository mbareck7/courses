package tp_dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Main {
 public static void main(String[] args) {
	 
	 
	 
	 
	 
	 
	 Connection conn=null;
//	 Statement st=null;

	
	 try {
//		Class.forName("com.mysql.jdbc.Driver");
		 Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/person_car?user=root&password=");
//		st=conn.createStatement();
	 }catch(Exception e) {}
	

	 
	 
	 PersonDAO personeDao = new PersonDAO(conn);
	 
//	 personeDao.create(new  Person(1,"Hussein","Mbaba"));
//	 personeDao.delete(new  Person(0,"Hussein","Mbaba"));
//	 personeDao.update(new  Person(1,"Sidi","Mbareck"));
	Person p =  personeDao.find(1);
	
	System.out.println(p.getNom());
	 
	 
	 
	 
	 
	 
}
}
