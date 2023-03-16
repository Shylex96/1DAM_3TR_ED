package es.studium.exercise1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class exercise1 implements WindowListener, ActionListener {
	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblCelsius = new Label("Celsius");
	TextField txtCelsius = new TextField(5);
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtFahrenheit = new TextField(5);
	Button btnCelFah = new Button(" Celsius a Fahrenheit ");
	Button btnFahCel = new Button(" Fahrenheit a Celsius ");

	public exercise1() {
		ventana.setLayout(new GridLayout(3, 2));
		ventana.addWindowListener(this);
		ventana.add(lblCelsius);
		ventana.add(txtCelsius);
		ventana.add(lblFahrenheit);
		ventana.add(txtFahrenheit);
		btnCelFah.addActionListener(this);
		btnFahCel.addActionListener(this);
		ventana.add(btnCelFah);
		ventana.add(btnFahCel);
		ventana.setSize(450, 100);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new exercise1();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource().equals(btnCelFah)) {
			float celsius = Float.parseFloat(txtCelsius.getText());
// °F = (°C x 9/5) + 32
			float fahrenheit = (celsius * 9.0f / 5.0f) + 32.0f;
			txtFahrenheit.setText(fahrenheit + "");
		} else {
			float fahrenheit = Float.parseFloat(txtFahrenheit.getText());
// °C = (°F - 32) x 5/9
			float celsius = (fahrenheit - 32.0f) * 5.0f / 9.0f;
			txtCelsius.setText(celsius + "");
		}
	}
}