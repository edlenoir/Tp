
public abstract class Classe {
	
	private int Force ;
	private int Intelligence;
	private int Discretion;
	private String NomClasse;
	
	
	public Classe(int force, int intelligence, int discretion, String nomClasse) {
		this.Force = force;
		this.Intelligence = intelligence;
		this.Discretion = discretion;
		this.NomClasse = nomClasse;
	}

	public void setForce(int force) {
		Force = force;
	}

	public void setIntelligence(int intelligence) {
		Intelligence = intelligence;
	}

	public void setDiscretion(int discretion) {
		Discretion = discretion;
	}
	
	public abstract void Equipement() ;

	@Override
	public String toString() {
		return "Il appartient a la Classe : " + NomClasse + "\nIntelligence : "+ this.Intelligence+ "\nForce : "+ this.Force + "\nDiscretion : "+ this.Discretion +" \n";
	}
	
}
