import java.util.List;

public class Catalogue {
	   private Arbre unArbre;
	   private Banc unBanc;
	   private Toboggan unToboggan;
	   private Balancoire unBalancoire;
	   private Tourniquet unTourniquet;
	   private Immeuble unImmeuble;
	   private Cite uneCite;
	   private static Catalogue instance;
	   
	   private Catalogue() {
		   unImmeuble = new Immeuble(0.0, 0.0, "Blanc", 4, 3);
		   unArbre = new Arbre(8, "Brun", "Vert",0.0,0.0);
		   unBalancoire = new Balancoire(0.0, 0.0, "Vert", 3, 2);
		   unBanc = new Banc(0.0, 0.0, "Brun", 1, 2);
		   unToboggan = new Toboggan(0.0, 0.0, "Jaune", 2, 4);
		   unTourniquet = new Tourniquet(0.0, 0.0, "Rouge", 1, 3);
		   uneCite = new Cite("cité des alouettes");
		   initializeCité();
		   }
	   
	   private void initializeCité() {
		   List<ObjectGraphique> data = uneCite.getList();
		   data.add(unImmeuble.clone());
		   data.add(unImmeuble.clone());
		   data.add(unBanc.clone());
		   data.add(unBanc.clone());
		   data.add(unBanc.clone());
		   data.add(unBalancoire.clone());
		   data.add(unToboggan.clone());
		   data.add(unArbre.clone());
		   data.add(unArbre.clone());
		   }
	   
	   
	public Arbre getArbre() {
		return (Arbre) this.unArbre.clone();
	}
	public Banc getBanc() {
		return (Banc) this.unBanc.clone();
	}
	public Toboggan getToboggan() {
		return (Toboggan) this.unToboggan.clone();
	}
	public Balancoire getBalancoire() {
		return (Balancoire) this.unBalancoire.clone();
	}
	public Tourniquet getTourniquet() {
		return (Tourniquet) this.unTourniquet.clone();
	}
	public Immeuble getImmeuble() throws CloneNotSupportedException {
		return (Immeuble) this.unImmeuble.clone();
	}
	public Cite getCite() throws CloneNotSupportedException {
		return (Cite) this.uneCite.clone();
	}
	
	public static synchronized Catalogue getInstance() {
		if (instance == null)
			instance = new Catalogue();
			return instance;
	}


	   
}
