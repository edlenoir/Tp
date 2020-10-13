
public class Registre {
	private String nom;
	private static Registre fichier;

	private Registre(String nom) {
		this.nom = nom;
	}


	public static synchronized Registre getInstance() {
		if(fichier == null) {
			Registre.fichier= new Registre("Par defaut");
		}
		return Registre.fichier;
	}


	
	
}
