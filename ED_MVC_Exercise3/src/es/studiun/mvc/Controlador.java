package es.studiun.mvc;

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
		v.btnComprobar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object a = e.getSource();
		if (a.equals(vista.btnComprobar)) {

			modelo.resultado = "";
			if (vista.chkCorrer.getState() == true) {
				modelo.resultado = modelo.aficion("Correr");
			}
			if (vista.chkNadar.getState() == true) {
				modelo.resultado = modelo.aficion("Nadar");
			}
			if (vista.chkAndar.getState() == true) {
				modelo.resultado = modelo.aficion("Andar");
			}
			if (vista.chkLeer.getState() == true) {
				modelo.resultado = modelo.aficion("Leer");
			}
			if (vista.chkCine.getState() == true) {
				modelo.resultado = modelo.aficion("Ir al Cine");
			}
			if (vista.chkBailar.getState() == true) {
				modelo.resultado = modelo.aficion("Bailar");
			}
			if (vista.chkFutbol.getState() == true) {
				modelo.resultado = modelo.aficion("Fútbol");
			}
			if (vista.chkTenis.getState() == true) {
				modelo.resultado = modelo.aficion("Tenis");
			}
			if (vista.chkBaloncesto.getState() == true) {
				modelo.resultado = modelo.aficion("Baloncesto");
			}
			if (vista.chkVela.getState() == true) {
				modelo.resultado = modelo.aficion("Deportes de vela");
			}
			
			System.out.println(modelo.resultado);
		

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



