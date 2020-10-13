
public class Patronyme implements Cloneable{
	
	private String nom;
	private String prenom;
	public Patronyme(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Patronyme [nom=" + nom + ", prenom=" + prenom + "]";
	}
	

	public Patronyme clone()  {
		Patronyme clone= null;
		
		try {
			clone = (Patronyme) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
		
	}
	

}
