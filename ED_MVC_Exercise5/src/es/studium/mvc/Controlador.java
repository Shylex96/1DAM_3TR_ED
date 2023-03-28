package es.studium.mvc;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Controlador implements WindowListener, ItemListener
{
	Modelo modelo;
	Vista vista;
	public Controlador(Modelo m, Vista v)
	{
		modelo = m;
		vista = v;
		// Añadir el Listener a la ventana

		v.ventana.addWindowListener(this);
		v.choProvincias.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		int posicion = 0;
		for (String provincia : vista.provincias)
		{
			if (provincia.equals(e.getItem()))
			{
				vista.txtGentilicio.setText(modelo.getGentilicio(posicion));
			}
			posicion++;
		}
	}
	
	@Override
	public void windowOpened(WindowEvent e){}
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