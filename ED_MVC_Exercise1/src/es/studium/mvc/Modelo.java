package es.studium.mvc;

public class Modelo {

	public float celsiusFahrenheit (float celsius) {
		return (celsius * 9.0f / 5.0f) + 32.0f;
	}


	public float fahrenheitCelsius (float fahrenheit) {
		return (fahrenheit - 32.0f) * 5.0f / 9.0f;
	}
}

