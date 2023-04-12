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

	public void setOperador1(int operador) {
		this.operador1 = operador;
	}

	public void setOperador2(int operador) {
		this.operador2 = operador;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public int getResultado() {
		int resultado = 0;
		if (operacion != null) {
			
			if (operacion.equals("+")) {
				resultado = operador1 + operador2;
			} else if (operacion.equals("-")) {
				resultado = operador1 - operador2;
			} else if (operacion.equals("*")) {
				resultado = operador1 * operador2;
			} else if (operacion.equals("/")) {
				resultado = operador1 / operador2;
			}
		}
		return resultado;
	}
	
	
	public String getOperacion() {
	    return operacion;
	}
}

