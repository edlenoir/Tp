
public class Mage {
	//J'ai ajouter les attributs force,intelligence,discretion et nomClasse pour palier au faite de ne plus avoir d'heritage
	String equipement ;
	private int force ;
	private int intelligence;
	private int discretion;
	private String nomClasse;
	
	public Mage(int force, int intelligence, int discretion, String nomClasse) {         
		this.force = 2;
		this.intelligence = 6;
		this.discretion = 2;
		this.nomClasse = "Mage";
	}
	
	
	public void Equipement() {
		equipement = "Baton";
	}

	//J'ai remplace le super par le toString de Classe pour palier au fait de ne plus avoirs d'heritage
	@Override
	public String toString() {
		return "Il appartient a la Classe : " + nomClasse + "\nIntelligence : "+ this.intelligence+ "\nForce : "+ this.force + "\nDiscretion : "+ this.discretion +" \n" + "Equipement : "+ this.equipement + "\n\n";
	}
	
}