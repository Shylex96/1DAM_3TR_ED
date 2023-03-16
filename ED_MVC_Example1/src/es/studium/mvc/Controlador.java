package es.studium.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{

	
	Modelo modelo;
	Vista vista;
	
	public Controlador (Modelo m, Vista v) {
		
		modelo = m;
		vista = v;
		
		v.btnCalcular.addActionListener(this);
		v.ventana.addWindowListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int numero = Integer.parseInt(vista.txtNumero.getText());
		vista.txtResultado.setText(modelo.calcDouble(numero)+"");
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
