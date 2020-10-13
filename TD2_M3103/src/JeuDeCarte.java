
public class JeuDeCarte {
	private int nbCarte;
	private uneCarte[] paquet;
	
	public JeuDeCarte() {
		this.paquet = new uneCarte[valeur.values().length * couleur.values().length];
		this.nbCarte = 0;
		for(valeur v  : valeur.values()) {
			for(couleur c :couleur.values()) {
				this.paquet[this.nbCarte] = new uneCarte(c,v);
				this.nbCarte ++;
			}
		}
	}
	
	public void classer() {
        boolean echange = false;
        do {
            echange = false;
            for (int i = 0 ; i < this.nbCarte-1 ; i++) {
                if (this.paquet[i].getCouleur().ordinal() > this.paquet[i+1].getCouleur().ordinal() ||
                    (this.paquet[i].getCouleur().ordinal() == this.paquet[i+1].getCouleur().ordinal() &&
                    this.paquet[i].getValeur().ordinal() > this.paquet[i+1].getValeur().ordinal())) {
                    uneCarte temp = this.paquet[i];
                    this.paquet[i] = this.paquet[i+1];
                    this.paquet[i+1] = temp;
                    
                    echange = true;
                }
            }
        }        
        while (echange);
    }

	   
	   public void mélangerPaquet() {
	        for (int i = 0; i < 10; i++) {    // On mélange 10 fois
	            for (int j = 0; j < paquet.length; j++) {
	                int r = (int) (0 + Math.random() * (paquet.length - 0));
	                uneCarte tmp = paquet[j];
	                paquet[j] = paquet[r];
	                paquet[r] = tmp;
	            }
	        }
	    } 
	   public void afficherPaquet() {
	        for (int i = 0; i < this.nbCarte; i++) {
	            System.out.println(this.paquet[i]);
	        }
	    }
	   
	   
	   public String retourner() {
		   uneCarte c = premiereCarte();
		   for (int i = 0 ;i <this.nbCarte - 1;i++) {
			   this.paquet[i]= paquet[i+1];
		   }
		   this.paquet[this.nbCarte - 1]= c;
		   return c.toString();
	    }
	   
	   public uneCarte premiereCarte() {
		   return (this.paquet[0]);
	    }
	   
	   public void distribuer()throws PaquetVide {
		   if(nbCarte<0)
			   throw new PaquetVide("Le Paquet et vide");
		   for (int i = 0 ;i <this.nbCarte - 1;i++) {
			   this.paquet[i]= paquet[i+1];
		   }
		   this.nbCarte --;
	   }
}

