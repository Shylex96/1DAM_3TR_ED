package es.studium.mvc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Vista {
	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblCelsius = new Label("Celsius");
	TextField txtCelsius = new TextField(5);
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtFahrenheit = new TextField(5);
	Button btnCelFah = new Button(" Celsius a Fahrenheit ");
	Button btnFahCel = new Button(" Fahrenheit a Celsius ");

	public Vista() {
		ventana.setLayout(new GridLayout(3, 2));
		ventana.add(lblCelsius);
		ventana.add(txtCelsius);
		ventana.add(lblFahrenheit);
		ventana.add(txtFahrenheit);
		ventana.add(btnCelFah);
		ventana.add(btnFahCel);
		ventana.setSize(450, 100);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

}
