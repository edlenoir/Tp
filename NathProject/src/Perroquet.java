
public class Perroquet extends Animal{

	public Perroquet(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		super(couleur, poids, taille, nom, race, sexe, age);
	}

	public String interragirAnimal(String action) {
		return (this.getNom()+" vous répond : "+action+" "+action);
	}

	@Override
	public String typeAnimal() {
		return "Perroquet";
	}

	
}
