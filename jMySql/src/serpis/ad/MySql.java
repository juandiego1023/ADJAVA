package serpis.ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		//Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/dbprueba?user=root&password=sistemas");
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery("select * from categoria");
		
		while(resultset.next()){
			System.out.printf("id=%4s nombre=%s\n",resultset.getObject("id"),resultset.getObject("nombre"));
		}
		
		
		resultset.close();
		connection.close();
				
				
	}

}
