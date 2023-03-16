package es.studium.exercise2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class exercise2 implements WindowListener, ActionListener {
	Frame ventana = new Frame("Calcular el IVA");
	Label lab1 = new Label("Introduzca la cantidad");
	Label lab2 = new Label("Introduzca el porcentaje");
	Label lab3 = new Label("Resultado");
	TextField txt1 = new TextField(10);
	TextField txt2 = new TextField(10);
	TextField txtResultado = new TextField(20);
	Button btnCalcular = new Button("Calcular");

	public exercise2() {
		ventana.setLayout(new FlowLayout());
		// Añadimos los componentes
		ventana.add(lab1);
		ventana.add(txt1);
		ventana.add(lab2);
		ventana.add(txt2);
		ventana.add(btnCalcular);
		ventana.add(lab3);
		ventana.add(txtResultado);
		// Añadir Listeners
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		// Establecemos el tamaño
		ventana.setSize(300, 200);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		// Hacemos visible la pantalla
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new exercise2();
	}

	public void actionPerformed(ActionEvent e) {
		// Averiguar botón pulsado
		Object a = e.getSource();
		if (a.equals(btnCalcular)) {
			// Calculamos el porcentaje
			float resultado = Float.parseFloat(txt1.getText()) * Float.parseFloat(txt2.getText()) / (float) 100.0;
			// Reseteamos los elementos
			txt1.selectAll();
			txt1.setText("");
			txt2.selectAll();
			txt2.setText("");
			// Y ponemos el cursor de nuevo en el primer cuadro de texto
			txt1.requestFocus();
			// Colocamos el resultado en el Textfield correspondiente
			// Sumar "" a un número lo transforma en CADENA
			txtResultado.setText(resultado + "");
		}
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}
}
