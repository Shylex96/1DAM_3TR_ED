package es.studium.mvc;

public class Modelo
{
	String[] ciudades = {"No ha elegido ningún equipo", "Madrid", "Barcelona",
			"Tenerife", "Vitoria", "Burgos", "Valencia","Badalona", "Málaga","Murcia", "Manresa",
			"Andorra", "Gran Canaria", "Santiago de Compostela", "Madrid", "Zaragoza",
			"Fuenlabrada", "Sevilla", "Bilbao", "Guipuzcoa"};
	public String getCiudadEquipoBaloncesto(int indice)
	{
		return ciudades[indice];
	}
}