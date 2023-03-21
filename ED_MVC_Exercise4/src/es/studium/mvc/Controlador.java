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
		v.btnCalcular.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		modelo.presupuesto = 0;
		
		if (vista.chkGasolina.getState() == true) {
			modelo.presupuesto = modelo.calcularPresupuesto(7000);
		}
		if (vista.chkDiesel.getState() == true) {
			modelo.presupuesto = modelo.calcularPresupuesto(8000);
		}
		if (vista.chkHibrido.getState() == true) {
			modelo.presupuesto = modelo.calcularPresupuesto(9000);
		}
		if (vista.chkElectrico.getState() == true) {
			modelo.presupuesto = modelo.calcularPresupuesto(8500);
		}
		if (vista.chkTresPuertas.getState() == true) {
			modelo.presupuesto = modelo.calcularPresupuesto(2000);
		}
		if (vista.chkCuatroPuertas.getState() == true) {
			modelo.presupuesto = modelo.calcularPresupuesto(3000);
		}
		if (vista.chkCincoPuertas.getState() == true) {
			modelo.presupuesto = modelo.calcularPresupuesto(2500);
		}
		if (vista.chkPinturaMetalizada.getState() == true) {
			modelo.presupuesto = modelo.calcularPresupuesto(1500);
		}
		
		vista.txtPresupuesto.setText(modelo.presupuesto + " €");
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

