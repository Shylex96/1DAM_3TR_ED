package es.studium.exercise8;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class exercise8 implements WindowListener, ActionListener {

	Frame ventana = new Frame("Agenda");
	MenuBar barraMenu = new MenuBar();
	Menu agendadecitas = new Menu("Agenda de Citas");
	Menu eventos = new Menu("Eventos");
	Menu libretadedirecciones = new Menu("Libreta de Direcciones");
	MenuItem agendadecitasNuevo = new MenuItem("Elemento Nuevo");
	MenuItem agendadecitasEliminar = new MenuItem("Eliminar una Existente");
	MenuItem agendadecitasConsultar = new MenuItem("Consultar las Existentes");
	MenuItem agendadecitasModificar = new MenuItem("Modificar Cita");
	MenuItem eventoNuevo = new MenuItem("Evento Nuevo");
	MenuItem eventoEliminar = new MenuItem("Eliminar Evento");
	MenuItem eventoConsultar = new MenuItem("Consultar Evento");
	MenuItem eventoModificar = new MenuItem("Modificar Evento");
	MenuItem libretadedireccionesNueva = new MenuItem("Nueva Dirección");
	MenuItem libretadedireccionesEliminar = new MenuItem("Eliminar Dirección");
	MenuItem libretadedireccionesConsultar = new MenuItem("Consultar Dirección");
	MenuItem libretadedireccionesModificar = new MenuItem("Modificar Dirección");
	Dialog dlgDialogo = new Dialog(ventana, "Diálogo con mensaje", true);
	Label lblMensaje = new Label("");

	public exercise8() {
		
		ventana.setLayout(new FlowLayout());
		ventana.setMenuBar(barraMenu);
		agendadecitas.add(agendadecitasNuevo);
		agendadecitas.add(agendadecitasEliminar);
		agendadecitas.add(agendadecitasConsultar);
		agendadecitas.add(agendadecitasModificar);
		agendadecitasNuevo.addActionListener(this);
		agendadecitasEliminar.addActionListener(this);
		agendadecitasConsultar.addActionListener(this);
		agendadecitasModificar.addActionListener(this);
		eventos.add(eventoNuevo);
		eventos.add(eventoEliminar);
		eventos.add(eventoConsultar);
		eventos.add(eventoModificar);
		eventoNuevo.addActionListener(this);
		eventoEliminar.addActionListener(this);
		eventoConsultar.addActionListener(this);
		eventoModificar.addActionListener(this);
		libretadedirecciones.add(libretadedireccionesNueva);
		libretadedirecciones.add(libretadedireccionesEliminar);
		libretadedirecciones.add(libretadedireccionesConsultar);
		libretadedirecciones.add(libretadedireccionesModificar);
		libretadedireccionesNueva.addActionListener(this);
		libretadedireccionesEliminar.addActionListener(this);
		libretadedireccionesConsultar.addActionListener(this);
		libretadedireccionesModificar.addActionListener(this);
		barraMenu.add(agendadecitas);
		barraMenu.add(eventos);
		barraMenu.add(libretadedirecciones);
		ventana.addWindowListener(this);
		dlgDialogo.setLayout(new FlowLayout());
		dlgDialogo.setSize(200, 150);
		dlgDialogo.setLocationRelativeTo(null);

		// Para poder cerrar el Diálogo
		dlgDialogo.addWindowListener(this);
		ventana.setSize(350, 200);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{
		new exercise8();
	}

	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we) {

		if (dlgDialogo.hasFocus())
		{
			dlgDialogo.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}

	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void actionPerformed(ActionEvent ae)
	{
		Object a;
		a = ae.getSource();
		if (a.equals(agendadecitasNuevo))
		{
			lblMensaje.setText("Nueva Cita");
		}
		else if (a.equals(agendadecitasEliminar))
		{
			lblMensaje.setText("Eliminar Cita");
		}
		else if (a.equals(agendadecitasConsultar))
		{
			lblMensaje.setText("Consultar Cita");
		}

		else if (a.equals(agendadecitasModificar))
		{
			lblMensaje.setText("Modificar Cita");
		}

		else if (a.equals(eventoNuevo))
		{
			lblMensaje.setText("Nuevo Evento");
		}

		else if (a.equals(eventoEliminar))

		{
			lblMensaje.setText("Eliminar Evento");
		}

		else if (a.equals(eventoConsultar))
		{
			lblMensaje.setText("Consultar Evento");
		}

		else if (a.equals(eventoModificar))
		{
			lblMensaje.setText("Modificar Evento");
		}

		else if (a.equals(libretadedireccionesNueva))
		{
			lblMensaje.setText("Nuevo Contacto");
		}

		else if (a.equals(libretadedireccionesEliminar))
		{
			lblMensaje.setText("Eliminar Contacto");
		}

		else if (a.equals(libretadedireccionesConsultar))
		{
			lblMensaje.setText("Consultar Contacto");
		}

		else
		{
			lblMensaje.setText("Modificar Contacto");
		}
		
		dlgDialogo.add(lblMensaje);
		dlgDialogo.setVisible(true);
	}
}
