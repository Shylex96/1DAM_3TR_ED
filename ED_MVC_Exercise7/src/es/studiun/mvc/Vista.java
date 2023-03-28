package es.studiun.mvc;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Vista {

	Frame ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();
	Menu articulos = new Menu("Artículos");
	Menu clientes = new Menu("Clientes");
	Menu facturas = new Menu("Facturas");
	MenuItem articuloNuevo=new MenuItem("Nuevo Artículo");
	MenuItem articuloEliminar=new MenuItem("Eliminar Artículo");
	MenuItem articuloConsultar=new MenuItem("Consultar Artículo");
	MenuItem clientesNuevo=new MenuItem("Nuevo Cliente");
	MenuItem clientesEliminar=new MenuItem("Eliminar Cliente");
	MenuItem clientesConsultar=new MenuItem("Consultar Cliente");
	MenuItem facturasNueva=new MenuItem("Nueva Factura");
	MenuItem facturaConsultar=new MenuItem("Consultar Factura");
	Dialog dlgDialogo = new Dialog(ventana, "Diálogo con mensaje", true);
	Label lblMensaje = new Label("");

	public Vista() {
		ventana.setLayout(new FlowLayout());
		ventana.setMenuBar(barraMenu);
		articulos.add(articuloNuevo);
		articulos.add(articuloEliminar);
		articulos.add(articuloConsultar);
		clientes.add(clientesNuevo);
		clientes.add(clientesEliminar);
		clientes.add(clientesConsultar);
		facturas.add(facturasNueva);
		facturas.add(facturaConsultar);
		barraMenu.add(articulos);
		barraMenu.add(clientes);
		barraMenu.add(facturas);
		ventana.setSize(350,200);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		dlgDialogo.setLayout(new FlowLayout());
		dlgDialogo.setSize(200,150);
		dlgDialogo.setLocationRelativeTo(null);
	}
}
