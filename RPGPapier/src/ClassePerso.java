
public class ClassePerso {
	//J'ai ajouter les attributs force,intelligence,discretion et nomClasse pour palier au faite de ne plus avoir d'heritage
	String equipement ;
	private int force ;
	private int intelligence;
	private int discretion;
	private String nomClasse;
	
	public ClassePerso(int force, int intelligence, int discretion, String nomClasse) {
		this.force = force;
		this.intelligence = intelligence;
		this.discretion = discretion;
		this.nomClasse = nomClasse;
	}
	
	public void Equipement() {
		equipement = "Gourdin";
	}
	//J'ai remplace le super par le toString de Classe pour palier au fait de ne plus avoirs d'heritage
	@Override
	public String toString() {
		return "Il appartient a la Classe : " + nomClasse + "\nintelligence : "+ this.intelligence+ "\nforce : "+ this.force + "\ndiscretion : "+ this.discretion +" \n" + "Equipement : "+ this.equipement + "\n\n";
	}
}
