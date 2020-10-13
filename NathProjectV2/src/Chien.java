import java.util.Random;

public class Chien /*extends Animal*/{ //Chien n'h�rite donc plus de Animal

	/* //Le super n'existe donc plus car il n'y a plus de classe d'o� h�riter.
	 * 
	public Chien(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		super(couleur, poids, taille, nom, race, sexe, age);
	}
	*/
	
	//Il faut donc red�finir toutes les caract�ristiques d'un Chien et refaire le constructeur.
	private String couleur;
	private float poids;
	private float taille;
	private String nom;
	private String race;
	private boolean sexe;
	private int age;
	
	
	
	public Chien(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		this.couleur = couleur;
		this.poids = poids;
		this.taille = taille;
		this.nom = nom;
		this.race = race;
		this.sexe = sexe;
		this.age = age;
	}

	//Nous avons aussi besoin des getters pour nos m�thodes
	
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
			return (this.getNom()+ " ne semble pas int�ress�...");
		}
		else {
			return("");
		}
	}

	/*@Override L'override dispara�t car la m�thode ne viens pas d'une classe abstraite.*/
	public String typeAnimal() {
		return "Chien";
	}
	
	//Nous sommes aussi oblig� de cr�er un toString()
	@Override
	public String toString() {
		if (this.isSexe()) {
			return ("Je vous pr�sente "+this.getNom()+" voici sa fiche : ["+this.getNom()+" ; "+this.getRace()+" ; "+this.getCouleur()+" ; "
					+this.getAge()+"ans ; "+this.getPoids()+"kg ; "+this.getTaille()+"cm ; m�le]");
		}
		return ("Je vous pr�sente "+this.getNom()+" voici sa fiche : ["+this.getNom()+" ; "+this.getRace()+" ; "+this.getCouleur()+" ; "
				+this.getAge()+"ans ; "+this.getPoids()+"kg ; "+this.getTaille()+"cm ; femelle]");
	}
	

	
}
