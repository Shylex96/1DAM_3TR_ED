package es.studium.mvc;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Controlador implements WindowListener, ItemListener
{
	Modelo modelo;
	Vista vista;
	public Controlador(Modelo m, Vista v) {
		modelo = m;
		vista = v;
		v.ventana.addWindowListener(this);
		v.lisEquipos.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		int indice = vista.lisEquipos.getSelectedIndex();
		String ciudad = new String();
		ciudad = modelo.getCiudadEquipoBaloncesto(indice);
		System.out.println(ciudad);
	}
	@Override
	public void windowOpened(WindowEvent e)
	{
	}
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e){}
	@Override
	public void windowIconified(WindowEvent e){}
	@Override
	public void windowDeiconified(WindowEvent e){}
	@Override
	public void windowActivated(WindowEvent e){}
	@Override
	public void windowDeactivated(WindowEvent e){}
}