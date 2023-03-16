package es.studium.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener {

	Modelo modelo;
	Vista vista;
	
	public Controlador(Modelo m, Vista v) {
		
		modelo = m;
		vista = v;
	
		v.ventana.addWindowListener(this);
		v.btnCelFah.addActionListener(this);
		v.btnFahCel.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource().equals(vista.btnCelFah)) {
			float celsius = Float.parseFloat(vista.txtCelsius.getText());
			float fahrenheit = modelo.celsiusFahrenheit(celsius);
			vista.txtFahrenheit.setText(fahrenheit + "");
		} else {
			float fahrenheit = Float.parseFloat(vista.txtFahrenheit.getText());
			float celsius = modelo.celsiusFahrenheit(fahrenheit);
			vista.txtCelsius.setText(celsius + "");
		}
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) 
	{
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
