package es.studium.exercise9;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise9 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Base de datos");
	TextField idEmpleado = new TextField(25);
	TextField nombreEmpleado = new TextField(25);
	Button proximo = new Button("Próximo");
	Button anterior = new Button("Anterior");
	Button primero = new Button("Primero");
	Button ultimo = new Button("Último");
	// Crear un objeto tipo Connection
	Connection con = null;
	// Data Source Name de la Base de Datos
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
	
	public Exercise9()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(270, 160);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.add(idEmpleado);

		ventana.add(nombreEmpleado);
		ventana.add(primero);
		ventana.add(anterior);
		ventana.add(proximo);
		ventana.add(ultimo);
		proximo.addActionListener(this);
		anterior.addActionListener(this);
		primero.addActionListener(this);
		ultimo.addActionListener(this);
		ventana.addWindowListener(this);
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
			// Poner en los TextField los valores obtenidos del 1º
			idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
			nombreEmpleado.setText(rs.getString("nombreEmpleado"));
		} catch (SQLException e)
		{
			System.out.println("Error en la sentencia SQL");
		}
		ventana.setVisible(true);
	}// Fin del constructor
	public static void main(String[] args)
	{
		new Exercise9();
	}
	public void windowActivated(WindowEvent windowEvent){}
	public void windowClosed(WindowEvent windowEvent){}
	public void windowClosing(WindowEvent windowEvent)
	{
		// Cerrar los elementos de la base de datos
		try
		{
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e)
		{
			System.out.println("Error al cerrar " + e.toString());
		}
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent windowEvent){}
	public void windowDeiconified(WindowEvent windowEvent){}
	public void windowIconified(WindowEvent windowEvent){}
	public void windowOpened(WindowEvent windowEvent){}
	public void actionPerformed(ActionEvent actionEvent) {
		
		// Hemos pulsado Próximo
		if (proximo.equals(actionEvent.getSource()))
		{
			try
			{
				// Si no hemos llegado al final
				if (rs.next())
				{
					// Poner en los TextField los valores obtenidos
					idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
					nombreEmpleado.setText(rs.getString("nombreEmpleado"));
				} else
				{
					// Mueve el cursos al registro anterior
					rs.previous();
					idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
					nombreEmpleado.setText(rs.getString("nombreEmpleado"));
				}
			} catch (SQLException e)
			{
				System.out.println("Error en la sentencia SQL" +
						e.getMessage());
			}
		}
		// Hemos pulsado Previo
		if (anterior.equals(actionEvent.getSource()))
		{
			try
			{
				// Si no hemos llegado al final
				if (rs.previous())
				{
					// Poner en los TextField los valores obtenidos
					idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
					nombreEmpleado.setText(rs.getString("nombreEmpleado"));
				} else
				{
					rs.next();
					idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
					nombreEmpleado.setText(rs.getString("nombreEmpleado"));
				}
			} catch (SQLException e)
			{
				System.out.println("Error en la sentencia SQL" +
						e.getMessage());
			}
		}
		if (primero.equals(actionEvent.getSource()))
		{
			try
			{
				rs.first();
				idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
				nombreEmpleado.setText(rs.getString("nombreEmpleado"));
			} catch (SQLException e)
			{
				System.out.println("Error en la sentencia SQL" +
						e.getMessage());
			}
		}
		if (ultimo.equals(actionEvent.getSource()))
		{
			try
			{
				rs.last();
				idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
				nombreEmpleado.setText(rs.getString("nombreEmpleado"));
			} catch (SQLException e)
			{
				System.out.println("Error en la sentencia SQL" +
						e.getMessage());
			}
		}
	}
}
