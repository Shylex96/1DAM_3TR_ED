package es.studium.codigoCalculadora;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculadora implements WindowListener, ActionListener {
	
	Frame ventana = new Frame("Calculadora");
	Panel panel = new Panel();
	TextField pantalla = new TextField();
	Button boton0 = new Button("0");
	Button boton1 = new Button("1");
	Button boton2 = new Button("2");

	Button boton10 = new Button("+");
	Button boton3 = new Button("3");
	Button boton4 = new Button("4");
	Button boton5 = new Button("5");
	Button boton11 = new Button("-");
	Button boton6 = new Button("6");
	Button boton7 = new Button("7");
	Button boton8 = new Button("8");
	Button boton12 = new Button("*");
	Button boton9 = new Button("9");
	Button boton15 = new Button("C");
	Button boton14 = new Button("=");
	Button boton13 = new Button("/");
	
	int operador1 = 0;
	int operador2 = 0;
	
	String operacion;
	boolean nuevoNumeroEnPantalla;
	
	public Calculadora() {

		ventana.setLayout(new BorderLayout());
		ventana.setTitle("Calculadora");
		pantalla.setText("");
		pantalla.setBackground(Color.CYAN);
		ventana.add(pantalla, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(4, 3));
		boton0.addActionListener(this);
		panel.add(boton0);
		boton1.addActionListener(this);
		panel.add(boton1);
		boton2.addActionListener(this);
		panel.add(boton2);
		boton10.addActionListener(this);
		panel.add(boton10);
		boton3.addActionListener(this);
		panel.add(boton3);
		boton4.addActionListener(this);
		panel.add(boton4);
		boton5.addActionListener(this);
		panel.add(boton5);
		boton11.addActionListener(this);
		panel.add(boton11);
		boton6.addActionListener(this);
		panel.add(boton6);
		boton7.addActionListener(this);
		panel.add(boton7);
		boton8.addActionListener(this);
		panel.add(boton8);
		boton12.addActionListener(this);
		panel.add(boton12);
		boton9.addActionListener(this);
		panel.add(boton9);
		boton15.addActionListener(this);
		panel.add(boton15);
		boton14.addActionListener(this);
		panel.add(boton14);
		boton13.addActionListener(this);
		panel.add(boton13);
		ventana.add(panel, BorderLayout.CENTER);
		ventana.addWindowListener(this);
		ventana.setSize(300, 300);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		new Calculadora();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String botonPulsado = ((Button) e.getSource()).getLabel();
		if (botonPulsado.equals("C")) {
			pantalla.setText("0");
			operador1 = 0;
			operador2 = 0;
			nuevoNumeroEnPantalla = true;
		} else if (botonPulsado.equals("=")) {
			operador2 = Integer.parseInt(pantalla.getText());
			if (operacion != null) {
				if (operacion.equals("+")) {
					pantalla.setText((operador1 + operador2) + "");
				} else if (operacion.equals("-")) {
					pantalla.setText((operador1 - operador2) + "");
				} else if (operacion.equals("*")) {
					pantalla.setText((operador1 * operador2) + "");
				} else if (operacion.equals("/")) {
					pantalla.setText((operador1 / operador2) + "");
				}
			}
			nuevoNumeroEnPantalla = true;
			operacion = null;
		} else if (botonPulsado.equals("+") || botonPulsado.equals("-") ||
				botonPulsado.equals("*")
				|| botonPulsado.equals("/")) {
			operacion = botonPulsado;
			operador1 = Integer.parseInt(pantalla.getText());
			nuevoNumeroEnPantalla = true;
		} else {
			if (nuevoNumeroEnPantalla == true) {
				pantalla.setText(botonPulsado);
				nuevoNumeroEnPantalla = false;
			} else {
				pantalla.setText(pantalla.getText() + botonPulsado);
				if ((pantalla.getText().length() > 1) &&
						(pantalla.getText().charAt(0) == '0')) {
					pantalla.setText(pantalla.getText().substring(1));
				}
			}
		}
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowDeactivated(WindowEvent arg0) {}
	@Override
	public void windowDeiconified(WindowEvent arg0) {}
	@Override
	public void windowIconified(WindowEvent arg0) {}
	@Override
	public void windowOpened(WindowEvent arg0) {}

}


