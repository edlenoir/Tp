
public abstract class Classe {
	
	private int force ;
	private int intelligence;
	private int discretion;
	private String nomClasse;
	
	
	public Classe(int force, int intelligence, int discretion, String nomClasse) {
		this.force = force;
		this.intelligence = intelligence;
		this.discretion = discretion;
		this.nomClasse = nomClasse;
	}

	public void setforce(int force) {
		this.force = force;
	}

	public void setintelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void setdiscretion(int discretion) {
		this.discretion = discretion;
	}
	
	public abstract void Equipement() ;

	@Override
	public String toString() {
		return "Il appartient a la Classe : " + nomClasse + "\nintelligence : "+ this.intelligence+ "\nforce : "+ this.force + "\ndiscretion : "+ this.discretion +" \n";
	}
	
}