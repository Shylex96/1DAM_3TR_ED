package es.studium.mvc;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Vista {
	
	Frame ventana = new Frame("Vehículos");
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	Panel panel3 = new Panel();
	Panel panel4 = new Panel();
	Label lblMotorizacion = new Label("¿Tipo de motorización?");
	CheckboxGroup grupoMotor = new CheckboxGroup();
	Checkbox chkGasolina = new Checkbox("Gasolina", false, grupoMotor);
	Checkbox chkDiesel = new Checkbox("Diésel", false, grupoMotor);
	Checkbox chkHibrido = new Checkbox("Hibrido", false, grupoMotor);
	Checkbox chkElectrico = new Checkbox("Eléctrico", false, grupoMotor);
	Label lblPuertas = new Label("¿Número de puertas?");
	CheckboxGroup grupoPuertas = new CheckboxGroup();
	Checkbox chkTresPuertas = new Checkbox("3 puertas", false, grupoPuertas);
	Checkbox chkCuatroPuertas = new Checkbox("4 puertas", false, grupoPuertas);
	Checkbox chkCincoPuertas = new Checkbox("5 puertas", false, grupoPuertas);
	Label lblPintura = new Label("¿Pintura Metalizada?");
	CheckboxGroup grupoPintura = new CheckboxGroup();
	Checkbox chkPinturaMetalizada = new Checkbox("Si", false, grupoPintura);
	Checkbox chkPinturaNoMetalizada = new Checkbox("No", false, grupoPintura);
	Button btnCalcular = new Button("Calcular presupuesto");
	TextField txtPresupuesto = new TextField(20);
	
	public Vista() {
		ventana.setLayout(new FlowLayout());
		panel1.add(lblMotorizacion);
		panel1.add(chkGasolina);
		panel1.add(chkDiesel);
		panel1.add(chkHibrido);

		panel1.add(chkElectrico);
		ventana.add(panel1);
		panel2.add(lblPuertas);
		panel2.add(chkTresPuertas);
		panel2.add(chkCuatroPuertas);
		panel2.add(chkCincoPuertas);
		ventana.add(panel2);
		panel3.add(lblPintura);
		panel3.add(chkPinturaMetalizada);
		panel3.add(chkPinturaNoMetalizada);
		ventana.add(panel3);
		panel4.add(btnCalcular);
		panel4.add(txtPresupuesto);
		ventana.add(panel4);
		// Añadir el Listener a la ventana
		// Añadir Listener al botón
		ventana.setSize(450, 250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}
