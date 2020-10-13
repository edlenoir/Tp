public class TableMots {
	
	public static final int TAILLE_TABLE_MOTS = 1000;
	
	private static final int TAILLE_TABLE_INDEX = 4;
	
	private Mot[] mots;
	
	private int[] suivants;
	
	private int[] index;
	
	private int cptMots;
		
	public TableMots() {
		this.index = new int[TAILLE_TABLE_INDEX];
		for (int i = 0; i < this.index.length; i++) {
			this.index[i] = - 1;
		}
		this.mots = new Mot[TAILLE_TABLE_MOTS];
		this.suivants= new int[TAILLE_TABLE_MOTS];
		this.cptMots = 0;
	}
	
	public void enregistrerMot(Mot mot) throws TableMotsPleine {
		int rang = this.rechercheMot(mot);
		if (rang != -1) {
			this.mots[rang].incNbOcc();
		}
		else {
			this.insererMot(mot);
		}
	}
	
	private static boolean equals(Mot mot1, Mot mot2) {
		   if (mot1.getChaine().length() != mot2.getChaine().length()) {
	            return false;
	        }
	        char[] mot1bis = mot1.getChaine().toCharArray();
	        char[] mot2bis = mot2.getChaine().toCharArray();
	        for (int i = 0 ; i < mot1.getChaine().length() ; i++ ) {
	            if (mot1bis[i] != mot2bis[i]) {
	                return false;
	            }
	        }
	        return true;
	    }
	
	private static int hashCode(Mot mot) {
		char[] valueMot = mot.getChaine().toCharArray();
        int somme = 0;
        for (int i = 0; i < valueMot.length; i++)
            somme += valueMot[i] -'0';
        return somme % TAILLE_TABLE_INDEX;
	}
	
	private int rechercheMot(Mot mot) {
		int hashcode = hashCode(mot);
        int i = index[hashcode];
        while (i != -1) {
            if (equals(mot,mots[i])) {
                return i;
            }
            i = suivants[i];
        }
        return -1;
    }
	
	private void insererMot(Mot mot) throws TableMotsPleine {
        if (this.cptMots == TAILLE_TABLE_MOTS)
            throw new TableMotsPleine();
        this.mots[this.cptMots] = mot;
        int hashcode = hashCode(mot);
        insererEnDebutDeListe(hashcode);
        this.cptMots += 1;
    }

    private void insererEnDebutDeListe(int hashcode) {
        this.suivants[this.cptMots] = this.index[hashcode];
        this.index[hashcode] = this.cptMots;
    }
	
}
