package es.studium.mvc;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class Vista {
	
	Frame ventana = new Frame("Provincias Españolas");
	Choice choProvincias = new Choice();
	TextField txtGentilicio = new TextField(30);
	String[] provincias = { "Seleccione una provincia", "Álava", "Albacete",
			"Alicante", "Almería", "Asturias", "Ávila",
			"Badajoz", "Barcelona", "Burgos", "Cáceres", "Cádiz",
			"Cantabria", "Castellón", "Ciudad Real", "Córdoba",
			"La Coruña", "Cuenca", "Gerona", "Granada", "Guadalajara",
			"Guipúzcoa", "Huelva", "Huesca",
			"Islas Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid",
			"Málaga", "Murcia", "Navarra", "Orense",
			"Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca",
			"Segovia", "Sevilla", "Soria", "Tarragona",
			"Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia",
			"Valladolid", "Vizcaya", "Zamora", "Zaragoza" };
	
	public Vista() {
		ventana.setLayout(new FlowLayout());
		for (String provincia : provincias) {
			choProvincias.add(provincia);
		}
		ventana.add(choProvincias);
		ventana.add(txtGentilicio);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(425, 150);
		ventana.setVisible(true);
	}
}