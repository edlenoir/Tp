
public class Contact {
	private String nom;
	private String prenom;
	private String telephone;
	
	public Contact(String prenom, String nom,String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone= telephone;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	
	public String getTelephone() {
		return telephone;
	}

	@Override
	public String toString() {
		return nom + " " + prenom ;
	}
	
	

}
