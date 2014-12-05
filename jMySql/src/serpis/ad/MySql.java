package serpis.ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import java.sql.PreparedStatement;

public class MySql {
	
	private static Scanner ScarletJohanson=new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Menu:0-salir/1-nuevo/2-editar/3-eliminar/4-ver");
		opcion  		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/dbprueba?user=root&password=sistemas");
		//Statement statement=connection.createStatement();
		//Sin parametros
		//ResultSet resultset=statement.executeQuery("select * from categoria");
		
		//Con parametros
		PreparedStatement preparedStatement=connection.prepareStatement("select * from categoria where id=?"); 
		preparedStatement.setLong(1,19);//en el primer interrogante de id busca el 19
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()){
			System.out.printf("id=%4s nombre=%s\n",resultSet.getObject("id"),resultSet.getObject("nombre"));
			resultSet.getObject("nombre");
		}
		
		
		resultSet.close();
		connection.close();
				
				
	}

}
m