package es.studium.mvcCalculadora;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements ActionListener, WindowListener {

	Modelo modelo;
	Vista vista;

	public Controlador(Modelo m, Vista v) {

		this.modelo = m;
		this.vista = v;

		vista.boton0.addActionListener(this);
		vista.boton1.addActionListener(this);
		vista.boton2.addActionListener(this);
		vista.boton10.addActionListener(this);
		vista.boton3.addActionListener(this);
		vista.boton4.addActionListener(this);
		vista.boton5.addActionListener(this);
		vista.boton11.addActionListener(this);
		vista.boton6.addActionListener(this);
		vista.boton7.addActionListener(this);
		vista.boton8.addActionListener(this);
		vista.boton12.addActionListener(this);
		vista.boton9.addActionListener(this);
		vista.boton15.addActionListener(this);
		vista.boton14.addActionListener(this);
		vista.boton13.addActionListener(this);
		vista.ventana.addWindowListener(this);
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
	@SuppressWarnings({ "unlikely-arg-type", "unused" })
	@Override
	public void actionPerformed(ActionEvent e) {
		
		boolean nuevoNumeroEnPantalla;

		String botonPulsado = ((Button) e.getSource()).getLabel();
		if (botonPulsado.equals("C")) {
			
			vista.pantalla.setText("0");
			modelo.operador1 = 0;
			modelo.operador2 = 0;
			nuevoNumeroEnPantalla = true;

		} else if (botonPulsado.equals(botonPulsado.equals("+") || botonPulsado.equals("-") || botonPulsado.equals("*") || botonPulsado.equals("/"))) {
			
			modelo.operador1 = Integer.parseInt(vista.pantalla.getText());
			vista.pantalla.setText("");
			modelo.operacion = botonPulsado;
			
		} else if (botonPulsado.equals("=")) {
			
			modelo.operador2 = Integer.parseInt(vista.pantalla.getText());
			modelo.getResultado();
			vista.pantalla.setText(Integer.toString(modelo.getResultado()));		
			vista.pantalla.setText(Integer.toString(modelo.getResultado()));
			
		}
	}
}






