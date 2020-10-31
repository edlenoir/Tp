
public class Convive {
	
	private String nom;
	private String prenom;
	private Civiliter civ;
	

	public Convive(String nom, String prenom, Civiliter civ) {
		this.nom = nom;
		this.prenom = prenom;
		this.civ = civ;
	}
	
	


	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	@Override
	public String toString() {
		return "(" + civ + ")" + prenom + " " + nom + " ";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
