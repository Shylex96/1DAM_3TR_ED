package es.studium.exercise6;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class exercise6 implements WindowListener, ItemListener
{
	Frame ventana = new Frame("Baloncesto");
	// Creación de una lista con 5 elementos visibles y que no
	// permite multiselección
	List lisEquipos = new List(10, false);
	String[] Equipos = {"Seleccione un equipo", "Real Madrid","Barça","Iberoestar Tenerife",
			"TD Systems Baskonia","Hereda San Pablo Burgos","Valencia Basket","Club Joventut de Badalona",
			"Unicaja","UCAM Murcia","Baxi Manresa","MoraBanc Andorra","Herbalife Gran Canaria",
			"Monbus Obradoiro","Movistar Estudiantes","Casademont Zaragoza","Urbas Fuenlabrada",
			"Coosur Real Betis","RETAbet Bilbao Basket","Acunsa Gipuzkoa Basket"};
	
	String[] ciudades = {"No ha elegido ningún equipo", "Madrid", "Barcelona",
			"Tenerife", "Vitoria", "Burgos", "Valencia","Badalona", "Málaga","Murcia", "Manresa",
			"Andorra", "Gran Canaria", "Santiago de Compostela", "Madrid", "Zaragoza",
			"Fuenlabrada", "Sevilla", "Bilbao", "Guipuzcoa"};
	public exercise6()
	{
		ventana.setLayout(new FlowLayout());
		for(String equipo: Equipos)
		{
			lisEquipos.add(equipo);
		}
		ventana.add(lisEquipos);
		ventana.addWindowListener(this);
		lisEquipos.addItemListener(this);
		ventana.setSize(250,250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new exercise6();
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void itemStateChanged(ItemEvent ie)
	{
		String ciudad = new String();
		ciudad = ciudades[lisEquipos.getSelectedIndex()];
		System.out.println(ciudad);
	}
}