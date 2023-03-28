package es.studium.mvc;

public class Modelo
{
	String[ ] provincias = {"Seleccione una provincia","Álava","Albacete","Alicante","Almería","Asturias","Ávila","Badajoz","Barcelona","Burgos","Cáceres",
			"Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara",
			"Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra",
			"Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
			"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};

	String[]  gentilicios={"No ha elegido ninguna opción","Alavés/Alavesa o Babazorro/rra", "Albaceteño/ña o Albacetense", "Alicantino/na","Almeriense, Urcitano/na","Asturiano/na, Astur","Abulense, Avilés/esa", "Pacense, Badajocense, Badajoceño/ña", "Barcelonés/esa, Barcinonense", "Burgalés/esa", "Cacereño/ña", "Gaditano/na", "Cántabro/a","Castellonense", "Ciudadrealeño/ña", "Cordobés/esa","Coruñés", "Conquense", "Gerundense, Gironés/esa", "Granadino/na","Guadalajarño/ña, Caracense, Arriacense", "Guipuzcoano/na", "Onubense", "Oscense", "Balear", "Jaenés/esa, Jaenero/ro, Jienense, Giennense","Leonés/esa","Leridano","Lucense", "Madrileño/ña", "Malagueño/ña", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na", "Palmense", "Pontevedrés/esa","Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense", "Soriano/na","Tarracconense/a","Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na","Pucelano/na", "Vizcaíno/na",
			"Zamorano/na", "Zaragozano/na"};

	public String getGentilicio(int indice)
	{
		return gentilicios[indice];
	}
}