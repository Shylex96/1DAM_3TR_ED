package es.studium.mvcCalculadora;

public class Modelo {

	public int operador1;
	public int operador2;
	public String operacion;

	public Modelo() {
		operador1 = 0;
		operador2 = 0;
		operacion = null;
	}

	int resultado = 0;

	public int getSuma() {

		resultado = operador1 + operador2;
		return resultado;
	}

	public int getResta() {

		resultado = operador1 - operador2;
		return resultado;
	}

	public int getMultiplicacion() {

		resultado = operador1 * operador2;
		return resultado;
	}

	public int getDivision() {

		resultado = operador1 / operador2;
		return resultado;
	}
}

