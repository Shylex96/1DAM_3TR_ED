package es.studium.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo {

	// Crear un objeto tipo Connection
	Connection con = null;
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/ed_t5_mvc";
	String login = "root";
	String password = "Studium2022;";
	// Creamos una consulta a la base de datos
	String sentencia = "SELECT * FROM empleados";
	// Objeto donde se guarda la información de la consulta a la base de datos
	ResultSet rs = null;
	// Crear un statement de SQL
	Statement stmt = null;

	public Modelo() {
		// Cargar el Driver
		try
		{
			Class.forName(driver);
		} catch (ClassNotFoundException e)
		{
			System.out.println("Se ha producido un error al cargar el Driver");
		}
		// Establecer la conexión con la base de datos
		try
		{
			con = DriverManager.getConnection(url, login, password);
		} catch (SQLException e)
		{
			System.out.println("Se produjo un error al conectar a la Base de Datos");
		}
		// Realizar la consulta
		try
		{
			stmt =
					con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery("SELECT * FROM empleados");
			rs.next();
		} catch (SQLException e)
		{
			System.out.println("Error en la sentencia SQL");
		}
	}

}
