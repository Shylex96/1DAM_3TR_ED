package es.studium.mvc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Vista {
	Frame ventana = new Frame("Horas");
	Label lblHh1 = new Label("HH");
	TextField txtHh1 = new TextField(2);
	Label lblMm1 = new Label("MM");
	TextField txtMm1 = new TextField(2);
	Label lblHh2 = new Label("HH");
	TextField txtHh2 = new TextField(2);
	Label lblMm2 = new Label("MM");
	TextField txtMm2 = new TextField(2);
	Button btnCalcular = new Button("Calcular");
	TextField txtResultado = new TextField(10);

	public Vista() {
		ventana.setLayout(new GridLayout(3, 4));
		ventana.add(lblHh1);
		ventana.add(txtHh1);
		ventana.add(lblMm1);
		ventana.add(txtMm1);
		ventana.add(lblHh2);
		ventana.add(txtHh2);
		ventana.add(lblMm2);
		ventana.add(txtMm2);
		ventana.add(btnCalcular);
		ventana.add(txtResultado);
		ventana.setSize(450, 100);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main (String[] args) {
		new Vista();
	}
}
