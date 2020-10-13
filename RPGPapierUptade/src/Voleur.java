
public class Voleur extends Classe{
	
	String equipement ;

	public Voleur(int force, int intelligence, int discretion, String nomClasse) { 
		super(2,2,6,"Voleur");
	}
	
	public void Equipement() {
		 equipement = "Dague";	
	}
	
	@Override
	public String toString() {
		return super.toString() + "Equipement : "+ this.equipement + "\n\n";
	}

}
