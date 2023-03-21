package es.studium.exercise4;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class exercise4 implements WindowListener, ActionListener {
	
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
	
	public exercise4() {
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
		ventana.addWindowListener(this);
		// Añadir Listener al botón
		btnCalcular.addActionListener(this);
		ventana.setSize(450, 250);
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		new exercise4();
	}
	
	public void actionPerformed(ActionEvent ae) {
		int presupuesto = 0;
		if (chkGasolina.getState() == true) {
			presupuesto = presupuesto + 7000;
		}
		if (chkDiesel.getState() == true) {
			presupuesto = presupuesto + 8000;
		}
		if (chkHibrido.getState() == true) {
			presupuesto = presupuesto + 9000;
		}
		if (chkElectrico.getState() == true) {
			presupuesto = presupuesto + 8500;
		}
		if (chkTresPuertas.getState() == true) {
			presupuesto = presupuesto + 2000;
		}
		if (chkCuatroPuertas.getState() == true) {
			presupuesto = presupuesto + 3000;
		}
		if (chkCincoPuertas.getState() == true) {
			presupuesto = presupuesto + 2500;
		}
		if (chkPinturaMetalizada.getState() == true) {
			presupuesto = presupuesto + 1500;
		}
		txtPresupuesto.setText(presupuesto + " €");
	}
	
	public void windowActivated(WindowEvent we) {
	}
	public void windowClosed(WindowEvent we) {
	}
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {
	}
	public void windowDeiconified(WindowEvent we) {
	}
	public void windowIconified(WindowEvent we) {
	}
	public void windowOpened(WindowEvent we) {
	}
}


