
public abstract class Animal {

	private String couleur;
	private float poids;
	private float taille;
	private String nom;
	private String race;
	private boolean sexe;
	private int age;

	public Animal(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		super();
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

	public abstract String interragirAnimal(String action);
	
	public abstract String typeAnimal();
	
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
