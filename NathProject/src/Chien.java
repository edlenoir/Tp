import java.util.Random;

public class Chien extends Animal{

	public Chien(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		super(couleur, poids, taille, nom, race, sexe, age);
	}

	public String interragirAnimal(String action) {
		if (action.equals("Carresser")) {
			Random rand = new Random();
			int tirage = rand.nextInt(2 - 0);
			if (tirage==1) {
				return (this.getNom() + " remue la queue.");	
			}
			else {
				return (this.getNom()+" essaie de vous mordre.");
			}
		}
		if (action.contentEquals("Lancer une balle")) {
			Random rand = new Random();
			int tirage = rand.nextInt(2 - 0);
			if (tirage==1) {
				return(this.getNom()+ " va chercher la balle et revient en courant.");
			}
			return (this.getNom()+ " ne semble pas intéressé...");
		}
		else {
			return("");
		}
	}

	@Override
	public String typeAnimal() {
		return "Chien";
	}

	
}
