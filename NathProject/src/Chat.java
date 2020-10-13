import java.util.Random;

public class Chat extends Animal{
	
	public Chat(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		super(couleur, poids, taille, nom, race, sexe, age);
	}

	public String interragirAnimal(String action) {
		if (action.equals("Carresser")) {
			Random rand = new Random();
			int tirage = rand.nextInt(2 - 0);
			if (tirage==1) {
				return (this.getNom() + " ronronne.");
			}
			return (this.getNom()+ " s'éloigne");
			
		}
		return null;
	}


	@Override
	public String typeAnimal() {
		return "Chat";
	}
	
}
