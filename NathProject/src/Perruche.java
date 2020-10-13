
public class Perruche extends Animal{
	
	public Perruche(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		super(couleur, poids, taille, nom, race, sexe, age);
	}

	public String interragirAnimal(String action) {
		if (action.equals("Siflotter")) {
			return (this.getNom() + " sifflote à l'écoute de votre douce voix.");
		}
		return null;
	}

	@Override
	public String typeAnimal() {
		return "Perruche";
	}
	
}