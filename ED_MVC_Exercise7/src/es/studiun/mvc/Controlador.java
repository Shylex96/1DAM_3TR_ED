package es.studiun.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Controlador implements WindowListener, ActionListener
{
	Modelo modelo;
	Vista vista;
	public Controlador(Modelo m, Vista v)
	{
		modelo = m;
		vista = v;
		v.articuloNuevo.addActionListener(this);
		v.articuloEliminar.addActionListener(this);
		v.articuloConsultar.addActionListener(this);
		v.clientesNuevo.addActionListener(this);
		v.clientesEliminar.addActionListener(this);
		v.clientesConsultar.addActionListener(this);
		v.facturasNueva.addActionListener(this);
		v.facturaConsultar.addActionListener(this);
		v.ventana.addWindowListener(this);
		// Para poder cerrar el Diálogo
		v.dlgDialogo.addWindowListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a;
		a = e.getSource();
		if(a.equals(vista.articuloNuevo))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Artículo Nuevo"));
		}
		else if(a.equals(vista.articuloEliminar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Artículo Eliminar"));
		}
		else if(a.equals(vista.articuloConsultar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Artículo Consultar"));
		}
		else if(a.equals(vista.clientesNuevo))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Cliente Nuevo"));
		}
		else if(a.equals(vista.clientesEliminar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Cliente Eliminar"));
		}
		else if(a.equals(vista.clientesConsultar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Cliente Consultar"));
		}
		else if(a.equals(vista.facturasNueva))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Factura Nueva"));
		}
		else
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Factura Consultar"));
		}
		vista.dlgDialogo.add(vista.lblMensaje);
		vista.dlgDialogo.setVisible(true);
	}
	
	@Override
	public void windowOpened(WindowEvent e){}
	@Override
	public void windowClosing(WindowEvent e)
	{
		if (vista.dlgDialogo.hasFocus())
		{
			vista.dlgDialogo.setVisible(false);
			
		} else {
			System.exit(0);
		}
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