package serpis.ad;
//Instalar desde el repositorio de ubuntu libmysql-java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import java.sql.PreparedStatement;

public class MySql {
	
	private static Scanner ScarletJohanson=new Scanner(System.in);
	private static int opcion=0;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/dbprueba?user=root&password=sistemas");
		
		System.out.println("Menu:0-salir/1-nuevo/2-editar/3-eliminar/4-ver");
		opcion =ScarletJohanson.nextInt();
		
		switch(opcion){
		
		case 1: System.out.println("Ingrese el nombre");
				String nombre=ScarletJohanson.nextLine();
				//System.out.println("Ingrese la categoria");
				//int categoria=ScarletJohanson.nextInt();
				//System.out.println("Ingrese el precio");
				//int precio=ScarletJohanson.nextInt();
				PreparedStatement preparedStatementInsert=connection.prepareStatement("insert into articulo (nombre) VALUES(?)");
				preparedStatementInsert.setString(1,nombre);
				int resultSetInsert=preparedStatementInsert.executeUpdate();
		break;
		
		case 4:PreparedStatement preparedStatement=connection.prepareStatement("select * from categoria where id>=?"); 
			   preparedStatement.setLong(1,1);//en el primer interrogante de id busca el 19
			   ResultSet resultSet=preparedStatement.executeQuery();
			
			   while(resultSet.next()){
				   System.out.printf("id=%4s nombre=%s\n",resultSet.getObject("id"),resultSet.getObject("nombre"));
				   resultSet.getObject("nombre");
			   }
			   resultSet.close();
				
		 break;
		}
		
		//Class.forName("com.mysql.jdbc.Driver");
		//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/dbprueba?user=root&password=sistemas");
		//Statement statement=connection.createStatement();
		//Sin parametros
		//ResultSet resultset=statement.executeQuery("select * from categoria");
		
		connection.close();
				
				
	}

}
