package es.studium.exercise5;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class exercise5 implements WindowListener, ItemListener {
	Frame ventana = new Frame("Provincias Españolas");
	Choice choProvincias = new Choice();
	String[ ] provincias = {"Seleccione una provincia","Álava","Albacete","Alicante","Almería","Asturias","Ávila","Badajoz","Barcelona","Burgos","Cáceres",
			"Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara",
			"Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra",
			"Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
			"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};

	String[]  gentilicios={"No ha elegido ninguna opción","Alavés/Alavesa o Babazorro/rra", "Albaceteño/ña o Albacetense", "Alicantino/na","Almeriense, Urcitano/na","Asturiano/na, Astur","Abulense, Avilés/esa", "Pacense, Badajocense, Badajoceño/ña", "Barcelonés/esa, Barcinonense", "Burgalés/esa", "Cacereño/ña", "Gaditano/na", "Cántabro/a","Castellonense", "Ciudadrealeño/ña", "Cordobés/esa","Coruñés", "Conquense", "Gerundense, Gironés/esa", "Granadino/na","Guadalajarño/ña, Caracense, Arriacense", "Guipuzcoano/na", "Onubense", "Oscense", "Balear", "Jaenés/esa, Jaenero/ro, Jienense, Giennense","Leonés/esa","Leridano","Lucense", "Madrileño/ña", "Malagueño/ña", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na", "Palmense", "Pontevedrés/esa","Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense", "Soriano/na","Tarracconense/a","Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na","Pucelano/na", "Vizcaíno/na",
			"Zamorano/na", "Zaragozano/na"};
	TextField txtGentilicio = new TextField(30);
	
	public exercise5() {
		ventana.setLayout(new FlowLayout());
		for (String provincia : provincias) {
			choProvincias.add(provincia);
		}
		ventana.add(choProvincias);
		ventana.add(txtGentilicio);
		// Añadir el Listener a la ventana
		ventana.addWindowListener(this);
		choProvincias.addItemListener(this);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(300, 100);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new exercise5();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		int posicion = 0;
		for (String provincia : provincias) {
			if (provincia.equals(e.getItem())) {
				txtGentilicio.setText(gentilicios[posicion]);
			}
			posicion++;
		}
	}
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}
