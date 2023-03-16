package es.studium.mvc;

public class Modelo {

	public String difererenciaHoraria(int horas1, int horas2, int minutos1, int minutos2) {
		
		String resultado = "";
		
		if (horas1 <= horas2) {
			int horas = horas2 - horas1;
			int minutos = minutos2 - minutos1;
			if (minutos < 0) {
				minutos = 60 + minutos;
				horas = horas - 1;
			}
			if (horas < 10) {
				resultado = "0" + horas + ":";
			} else {
				resultado = horas + ":";
			}
			if (minutos < 10) {
				resultado = resultado + "0" + minutos;
			} else {
				resultado = resultado + minutos;
			}
		}
		return resultado;
	}
}
