package tp_dao;

import java.sql.Connection;

public class CarDAO extends DAO<Car> {
	
	public CarDAO(Connection conn) {
        super(conn);
    }


    public void create(Car obj) {}

     public void delete(Car obj) {}

     public void update(Car obj) {}

     public Car find(int id) {return new Car();}


}
