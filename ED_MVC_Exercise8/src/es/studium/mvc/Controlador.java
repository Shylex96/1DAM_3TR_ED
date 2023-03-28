package es.studium.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Controlador implements ActionListener, WindowListener {
	Modelo modelo;
	Vista vista;
	public Controlador(Modelo m, Vista v) {
		modelo = m;
		vista = v;
		v.agendadecitasNuevo.addActionListener(this);
		v.agendadecitasEliminar.addActionListener(this);
		v.agendadecitasConsultar.addActionListener(this);
		v.agendadecitasModificar.addActionListener(this);
		v.eventoNuevo.addActionListener(this);
		v.eventoEliminar.addActionListener(this);
		v.eventoConsultar.addActionListener(this);
		v.eventoModificar.addActionListener(this);
		v.libretadedireccionesNueva.addActionListener(this);
		v.libretadedireccionesEliminar.addActionListener(this);
		v.libretadedireccionesConsultar.addActionListener(this);
		v.libretadedireccionesModificar.addActionListener(this);
		v.ventana.addWindowListener(this);
		//Para poder cerrar el Diálogo
		v.dlgDialogo.addWindowListener(this);
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowClosing(WindowEvent e) {
		if(vista.dlgDialogo.isActive()) {
			vista.dlgDialogo.setVisible(false);
		} else {
			System.exit(0);
		}
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
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object a;
		a = e.getSource();
		if(a.equals(vista.agendadecitasNuevo))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Nueva Cita"));
		}
		else if(a.equals(vista.agendadecitasEliminar))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Eliminar Cita"));
		}
		else if(a.equals(vista.agendadecitasConsultar))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Consultar Cita"));
		}
		else if(a.equals(vista.agendadecitasModificar))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Modificar Cita"));
		}
		else if(a.equals(vista.eventoNuevo))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Nuevo Evento"));
		}
		else if(a.equals(vista.eventoEliminar))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Eliminar Evento"));
		}
		else if(a.equals(vista.eventoConsultar))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Consultar Evento"));
		}
		else if(a.equals(vista.eventoModificar))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Modificar Evento"));
		}
		else if(a.equals(vista.libretadedireccionesNueva))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Nuevo Contacto"));
		}
		else if(a.equals(vista.libretadedireccionesEliminar))
		{
			vista.lblMensaje.setText(modelo.mostrarEtiqueta("Modificar Evento"));
		}
		else if(a.equals(vista.libretadedireccionesConsultar))
		{
			vista.lblMensaje.setText("Consultar Contacto");
		}
		else
		{
			vista.lblMensaje.setText("Modificar Contacto");
		}
		vista.dlgDialogo.add(vista.lblMensaje);
		vista.dlgDialogo.setVisible(true);
	}
}
