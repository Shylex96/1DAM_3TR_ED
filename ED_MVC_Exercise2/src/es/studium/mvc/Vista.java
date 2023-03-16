package es.studium.mvc;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Vista {
	Frame ventana = new Frame("Calcular el IVA");
	Label lab1 = new Label("Introduzca la cantidad");
	Label lab2 = new Label("Introduzca el porcentaje");
	Label lab3 = new Label("Resultado");
	TextField txt1 = new TextField(10);
	TextField txt2 = new TextField(10);
	TextField txtResultado = new TextField(20);
	Button btnCalcular = new Button("Calcular");

	public Vista() {
		ventana.setLayout(new FlowLayout());
		// Añadimos los componentes
		ventana.add(lab1);
		ventana.add(txt1);
		ventana.add(lab2);
		ventana.add(txt2);
		ventana.add(btnCalcular);
		ventana.add(lab3);
		ventana.add(txtResultado);
		// Añadir Listeners
		// Establecemos el tamaño
		ventana.setSize(300, 200);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		// Hacemos visible la pantalla
		ventana.setVisible(true);
	}
}
