package es.studium.mvc;

public class Modelo {
	
	int presupuesto = 0;
	
	public int calcularPresupuesto (int seleccion) {
		
		return (presupuesto + seleccion);
	}
}
