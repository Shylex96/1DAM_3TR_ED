package es.studium.mvc;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class Vista {
	Frame ventana = new Frame("Base de datos");
	TextField idEmpleado = new TextField(25);
	TextField nombreEmpleado = new TextField(25);
	Button proximo = new Button("Próximo");
	Button anterior = new Button("Anterior");
	Button primero = new Button("Primero");
	Button ultimo = new Button("Último");

	public Vista()
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
		
		ventana.setVisible(true);
	}
}