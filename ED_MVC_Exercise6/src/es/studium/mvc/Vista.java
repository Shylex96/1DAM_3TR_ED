package es.studium.mvc;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
public class Vista
{
	Frame ventana = new Frame("Baloncesto");
	List lisEquipos = new List(10, false);
	String[] equipos = { "Seleccione un equipo", "Real Madrid", "Barça", "Iberoestar Tenerife",
			"TD Systems Baskonia", "Hereda San Pablo Burgos", "Valencia Basket", "Club Joventut de Badalona", "Unicaja", "UCAM Murcia",
			"Baxi Manresa", "MoraBanc Andorra", "Herbalife Gran Canaria", "Monbus Obradoiro", "Movistar Estudiantes",
			"Casademont Zaragoza", "Urbas Fuenlabrada", "Coosur", "Real Betis", "RETAbet Bilbao Basket", "Acunsa Gipuzkoa Basket" };
	
	public Vista() {
		ventana.setLayout(new FlowLayout());
		for (String equipo : equipos)
		{
			lisEquipos.add(equipo);
		}
		ventana.add(lisEquipos);
		ventana.setSize(250, 250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}
