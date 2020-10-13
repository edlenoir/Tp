import java.util.Random;

public class Chat /*extends Animal*/{  //Chat n'h�rite donc plus de Animal
	

	/* //Le super n'existe donc plus car il n'y a plus de classe d'o� h�riter.
	 * 
	public Chat(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		super(couleur, poids, taille, nom, race, sexe, age); 
		}
	*/
	
	private String couleur;
	private float poids;
	private float taille;
	private String nom;
	private String race;
	private boolean sexe;
	private int age;
	
	public Chat(String couleur, float poids, float taille, String nom, String race, boolean sexe, int age) {
		this.couleur = couleur;
		this.poids = poids;
		this.taille = taille;
		this.nom = nom;
		this.race = race;
		this.sexe = sexe;
		this.age = age;
	}


	public String interragirAnimal(String action) {
		if (action.equals("Carresser")) {
			Random rand = new Random();
			int tirage = rand.nextInt(2 - 0);
			if (tirage==1) {
				return (this.getNom() + " ronronne.");
			}
			return (this.getNom()+ " s'�loigne");
			
		}
		return null;
	}

	

	public boolean isSexe() {
		return sexe;
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


	public int getAge() {
		return this.age;
	}
	
	/*@Override L'override dispara�t car la m�thode ne viens pas d'une classe abstraite.*/
	public String typeAnimal() {
		return "Chat";
	}


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
