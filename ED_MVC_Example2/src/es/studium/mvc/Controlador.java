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
		
		int horas1 = Integer.parseInt(vista.txtHh1.getText());
		int minutos1 = Integer.parseInt(vista.txtMm1.getText());
		int horas2 = Integer.parseInt(vista.txtHh2.getText());
		int minutos2 = Integer.parseInt(vista.txtMm2.getText());
		
		String resultado = 
				modelo.difererenciaHoraria(horas1, horas2, minutos1, minutos2);
		vista.txtResultado.setText(resultado);
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {}
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
