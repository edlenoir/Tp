
public class ClassePerso extends Classe {
	
	String equipement ;
	
	public ClassePerso(int force, int intelligence, int discretion, String nomClasse) {
		super(force,intelligence,discretion,nomClasse);
	}
	
	public void Equipement() {
		equipement = "Gourdin";
	}
	
	@Override
	public String toString() {
		return super.toString() + "Equipement : "+ this.equipement + "\n\n";
	}
}
