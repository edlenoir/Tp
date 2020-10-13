
public class Perruche /*extends Animal*/{ //Perruche n'hérite donc plus de Animal
	
	/* //Le super n'existe donc plus car il n'y a plus de classe d'où hériter.
	 * 
	public Perruche(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		super(couleur, poids, taille, nom, race, sexe, age);
	}
	*/
	
	//Il faut donc redéfinir toutes les caractéristiques d'un Chien et refaire le constructeur.
	private String couleur;
	private float poids;
	private float taille;
	private String nom;
	private String race;
	private boolean sexe;
	private int age;

	public Perruche(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		this.couleur = couleur;
		this.poids = poids;
		this.taille = taille;
		this.nom = nom;
		this.race = race;
		this.sexe = sexe;
		this.age = age;
	}

	public String getCouleur() {
		return this.couleur;
	}

	public float getPoids() {
		return this.poids;
	}

	public float getTaille() {
		return this.taille;
	}

	public String getNom() {
		return this.nom;
	}

	public String getRace() {
		return this.race;
	}

	public boolean isSexe() {
		return this.sexe;
	}

	public int getAge() {
		return this.age;
	}


	public String interragirAnimal(String action) {
		if (action.equals("Siflotter")) {
			return (this.getNom() + " sifflote à l'écoute de votre douce voix.");
		}
		return null;
	}
	
	/*@Override L'override disparaît car la méthode ne viens pas d'une classe abstraite.*/
	public String typeAnimal() {
		return "Perruche";
	}
	
	//Nous sommes aussi obligé de créer un toString()
	@Override
	public String toString() {
		if (this.isSexe()) {
			return ("Je vous présente "+this.getNom()+" voici sa fiche : ["+this.getNom()+" ; "+this.getRace()+" ; "+this.getCouleur()+" ; "
					+this.getAge()+"ans ; "+this.getPoids()+"kg ; "+this.getTaille()+"cm ; mâle]");
		}
		return ("Je vous présente "+this.getNom()+" voici sa fiche : ["+this.getNom()+" ; "+this.getRace()+" ; "+this.getCouleur()+" ; "
				+this.getAge()+"ans ; "+this.getPoids()+"kg ; "+this.getTaille()+"cm ; femelle]");
	}
	
}