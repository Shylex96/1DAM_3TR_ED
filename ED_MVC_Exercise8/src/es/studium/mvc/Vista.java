package es.studium.mvc;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Vista {

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

	public Vista() {

		ventana.setLayout(new FlowLayout());
		ventana.setMenuBar(barraMenu);
		agendadecitas.add(agendadecitasNuevo);
		agendadecitas.add(agendadecitasEliminar);
		agendadecitas.add(agendadecitasConsultar);
		agendadecitas.add(agendadecitasModificar);
		eventos.add(eventoNuevo);
		eventos.add(eventoEliminar);
		eventos.add(eventoConsultar);
		eventos.add(eventoModificar);
		libretadedirecciones.add(libretadedireccionesNueva);
		libretadedirecciones.add(libretadedireccionesEliminar);
		libretadedirecciones.add(libretadedireccionesConsultar);
		libretadedirecciones.add(libretadedireccionesModificar);
		barraMenu.add(agendadecitas);
		barraMenu.add(eventos);
		barraMenu.add(libretadedirecciones);
		dlgDialogo.setLayout(new FlowLayout());
		dlgDialogo.setSize(200, 150);
		dlgDialogo.setLocationRelativeTo(null);

		// Para poder cerrar el Diálogo
		ventana.setSize(350, 200);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		

	}
}
