
public class Mage extends Classe {

	String equipement ;
	
	public Mage(int force, int intelligence, int discretion, String nomClasse) {         
		super(2,2,2,"Mage");
	}
	
	
	public void Equipement() {
		equipement = "Baton";
	}


	@Override
	public String toString() {
		return super.toString() + "Equipement : "+ this.equipement + "\n\n";
	}
	
}