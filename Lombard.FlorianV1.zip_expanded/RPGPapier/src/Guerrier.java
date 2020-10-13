
public class Guerrier extends Classe {

	String equipement ;
	
	public Guerrier(int force, int intelligence, int discretion, String nomClasse) {
		super(6,2,2,"Guerrier");
	}
	
	public void Equipement() {
		equipement = "Hache";	
	}
	
	@Override
	public String toString() {
		return super.toString() + "Equipement : "+ this.equipement + "\n\n";
	}

}