package es.studium.mvc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

public class Controlador implements WindowListener, ActionListener {

	Modelo m;
	Vista v;

	public Controlador(Modelo m, Vista v) {

		this.m = m;
		this.v = v;

		v.proximo.addActionListener(this);
		v.anterior.addActionListener(this);
		v.primero.addActionListener(this);
		v.ultimo.addActionListener(this);
		v.ventana.addWindowListener(this);

		// Poner en los TextField los valores obtenidos del 1º
		try {
			v.idEmpleado.setText(Integer.toString(m.rs.getInt("idEmpleado")));
			v.nombreEmpleado.setText(m.rs.getString("nombreEmpleado"));
		} catch (SQLException eq) {
			// TODO Auto-generated catch block
			System.out.println("Error en la sentencia SQL: " + eq.getMessage());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Hemos pulsado Próximo
		if (v.proximo.equals(e.getSource()))
		{
			try
			{
				// Si no hemos llegado al final
				if (m.rs.next())
				{
					// Poner en los TextField los valores obtenidos
					v.idEmpleado.setText(Integer.toString(m.rs.getInt("idEmpleado")));
					v.nombreEmpleado.setText(m.rs.getString("nombreEmpleado"));
				} else
				{
					// Mueve el cursos al registro anterior
					m.rs.previous();
					v.idEmpleado.setText(Integer.toString(m.rs.getInt("idEmpleado")));
					v.nombreEmpleado.setText(m.rs.getString("nombreEmpleado"));
				}
			} catch (SQLException e1)
			{
				System.out.println("Error en la sentencia SQL" +
						e1.getMessage());
			}
		}
		// Hemos pulsado Previo
		if (v.anterior.equals(e.getSource()))
		{
			try
			{
				// Si no hemos llegado al final
				if (m.rs.previous())
				{
					// Poner en los TextField los valores obtenidos
					v.idEmpleado.setText(Integer.toString(m.rs.getInt("idEmpleado")));
					v.nombreEmpleado.setText(m.rs.getString("nombreEmpleado"));
				} else
				{
					m.rs.next();
					v.idEmpleado.setText(Integer.toString(m.rs.getInt("idEmpleado")));
					v.nombreEmpleado.setText(m.rs.getString("nombreEmpleado"));
				}
			} catch (SQLException e2)
			{
				System.out.println("Error en la sentencia SQL" +
						e2.getMessage());
			}
		}
		if (v.primero.equals(e.getSource()))
		{
			try
			{
				m.rs.first();
				v.idEmpleado.setText(Integer.toString(m.rs.getInt("idEmpleado")));
				v.nombreEmpleado.setText(m.rs.getString("nombreEmpleado"));
			} catch (SQLException e3)
			{
				System.out.println("Error en la sentencia SQL" +
						e3.getMessage());
			}
		}
		if (v.ultimo.equals(e.getSource()))
		{
			try
			{
				m.rs.last();
				v.idEmpleado.setText(Integer.toString(m.rs.getInt("idEmpleado")));
				v.nombreEmpleado.setText(m.rs.getString("nombreEmpleado"));
			} catch (SQLException e4)
			{
				System.out.println("Error en la sentencia SQL" +
						e4.getMessage());
			}
		}
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// Cerrar los elementos de la base de datos
		try
		{
			m.rs.close();
			m.stmt.close();
			m.con.close();
		} catch (SQLException eq)
		{
			System.out.println("Error al cerrar " + e.toString());
		}
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
}
