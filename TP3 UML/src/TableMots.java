public class TableMots {
	
	public static final int TAILLE_TABLE_MOTS = 1000;
	
	private static final int TAILLE_TABLE_INDEX = 4;
	
	private Element[] mots;
	
	private int[] index;
	
	private int cptMots;
	
	private class Element {
		
		private String mot;
		
		private int nbOcc;
		
		private int suivant;
			
		public Element(String mot) {
			this.mot = mot;
			this.nbOcc = 1;
		}		

	}
		
	public TableMots() {
		this.index = new int[TAILLE_TABLE_INDEX];
		for (int i = 0; i < this.index.length; i++) {
			this.index[i] = - 1;
		}
		this.mots = new Element[TAILLE_TABLE_MOTS];
		this.cptMots = 0;
	}
	
	public void enregistrerMot(String mot) throws TableMotsPleine {
		int rang = this.rechercheMot(mot);
		if (rang != -1) {
			this.mots[rang].nbOcc++;
		} else {
			this.insererMot(mot);
		}
	}
	
	private static int hashCode(String mot) {
		char[] valueMot = mot.toCharArray();
        int somme = 0;
        for (int i = 0; i < valueMot.length; i++)
            somme += valueMot[i] -'0';
        return somme % TAILLE_TABLE_INDEX;
	}
	
	private static boolean equals(String mot1, String mot2) {
        if (mot1.length() != mot2.length()) {
            return false;
        }
        char[] mot1bis = mot1.toCharArray();
        char[] mot2bis = mot2.toCharArray();
        for (int i = 0 ; i < mot1.length() ; i++ ) {
            if (mot1bis[i] != mot2bis[i]) {
                return false;
            }
        }
        return true;
    }
	
	private int rechercheMot(String mot) {
		int hashcode = hashCode(mot);
        int i = index[hashcode];
        while (i != -1) {
            if (equals(mot,mots[i].mot)) {
                return i;
            }
            i = mots[i].suivant;
        }
        return -1;
    }
	
	private void insererMot(String mot) throws TableMotsPleine {
		if (this.cptMots!=TAILLE_TABLE_MOTS) {
			if(this.cptMots == 1000) {
	            throw new TableMotsPleine();
	        }
	        this.mots[this.cptMots].mot = mot;
	        this.mots[this.cptMots].suivant = this.index[mot.hashCode()];
	        this.index[mot.hashCode()] = this.cptMots;
	        this.cptMots++;
	    }
	}

	@Override
	public String toString() {
		String s = "Index" + "\n" + "-----" + "\n";
		for (int i = 0; i < this.index.length; i ++) {
			s += "index " + i + " : " + this.index[i] + "\n";
		}
		s += "\n" + "Mots" + "\n" + "----------------------" + "\n";
		for (int i = 0; i < this.cptMots; i ++) {
			Element m = this.mots[i];
			s += "mot " + i + " : " + m.mot + " " + m.nbOcc + " " + m.suivant + "\n";
		}
		return s;
	}

}
