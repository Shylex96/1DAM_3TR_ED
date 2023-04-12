package es.studium.mvcCalculadora;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Vista {
	
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

	public Vista() {

		ventana.setLayout(new BorderLayout());
		ventana.setTitle("Calculadora");
		pantalla.setText("");
		pantalla.setBackground(Color.CYAN);
		ventana.add(pantalla, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(4, 3));
		panel.add(boton0);
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton10);
		panel.add(boton3);
		panel.add(boton4);
		panel.add(boton5);
		panel.add(boton11);
		panel.add(boton6);
		panel.add(boton7);
		panel.add(boton8);
		panel.add(boton12);
		panel.add(boton9);
		panel.add(boton15);
		panel.add(boton14);
		panel.add(boton13);
		ventana.add(panel, BorderLayout.CENTER);

		ventana.setSize(300, 300);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

}
