package es.studium.exercise3;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class exercise3 implements WindowListener, ActionListener {
	Frame ventana = new Frame("Aficiones");
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFutbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkVela = new Checkbox("Deportes de Vela");
	Button btnComprobar = new Button("Comprobar");
	String resultado = new String("");

	public exercise3() {
		ventana.setLayout(new FlowLayout());
		ventana.add(chkCorrer);
		ventana.add(chkNadar);
		ventana.add(chkAndar);
		ventana.add(chkLeer);
		ventana.add(chkCine);
		ventana.add(chkBailar);
		ventana.add(chkFutbol);
		ventana.add(chkTenis);
		ventana.add(chkBaloncesto);
		ventana.add(chkVela);
		ventana.add(btnComprobar);
		// Añadir el Listener al botón
		btnComprobar.addActionListener(this);
		// Añadir el Listener a la ventana
		ventana.addWindowListener(this);
		ventana.setSize(350, 150);
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		new exercise3();
	}
	public void actionPerformed(ActionEvent we) {
		resultado = "";
		if (chkCorrer.getState() == true) {
			resultado = resultado + "Correr\n";
		}
		if (chkNadar.getState() == true) {
			resultado = resultado + "Nadar\n";
		}
		if (chkAndar.getState() == true) {
			resultado = resultado + "Andar\n";
		}
		if (chkLeer.getState() == true) {
			resultado = resultado + "Leer\n";
		}
		if (chkCine.getState() == true) {
			resultado = resultado + "Ir al Cine\n";
		}
		if (chkBailar.getState() == true) {
			resultado = resultado + "Bailar\n";
		}
		if (chkFutbol.getState() == true) {
			resultado = resultado + "Fútbol\n";
		}
		if (chkTenis.getState() == true) {
			resultado = resultado + "Tenis\n";
		}
		if (chkBaloncesto.getState() == true) {
			resultado = resultado + "Baloncesto\n";
		}
		if (chkVela.getState() == true) {
			resultado = resultado + "Deportes de vela\n";
		}
		System.out.println(resultado);
	}
	public void windowActivated(WindowEvent we) {
	}
	public void windowClosed(WindowEvent we) {
	}public void windowClosing(WindowEvent we) {
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



