import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


public class JeuDeCartev2 {

	private ArrayList<uneCarte> paquetuneCarte;
	private int nbuneCarte;
	private uneCarte carte;

	public JeuDeCartev2() {
        paquetuneCarte = new ArrayList<uneCarte>(52);
        int i = 0;
        for(valeur v: valeur.values()) {
            for (couleur c: couleur.values()) {
                uneCarte carte = new uneCarte(c,v);
                this.paquetuneCarte.add(carte);
                i++;
            }
        }	
        this.nbuneCarte = i;
    }
	

	public uneCarte premiereCarte() throws PaquetVide {
		if (this.nbuneCarte == 0) {
			throw new PaquetVide ("Le paquet est vide");
		}
		return this.paquetuneCarte.get(0);
	}
	
	public void afficherPaquet() {
		for (int i = 0; i < this.getNbuneCarte(); i++) {
			System.out.println(paquetuneCarte.get(i));
		}
	}
	
	public void classer() {
        boolean echange = false;
        do {
            echange = false;
            for (int i = 0 ; i < this.nbuneCarte-1 ; i++) {
                if (this.paquetuneCarte.get(i).getCouleur().ordinal() > this.paquetuneCarte.get(i+1).getCouleur().ordinal() ||
                    (this.paquetuneCarte.get(i).getCouleur().ordinal() == this.paquetuneCarte.get(i+1).getCouleur().ordinal() &&
                    this.paquetuneCarte.get(i).getValeur().ordinal() > this.paquetuneCarte.get(i+1).getValeur().ordinal())) {
                    Collections.swap(this.paquetuneCarte, i, i+1);
                    echange = true;
                }
            }
        }        
        while (echange);
    }
	
	public void melangerPaquet() {
	    for (int i = 0; i < 15; i++) {    // On melange 15 fois
	        for (int j = 0; j < paquetuneCarte.size() ; j++) {
	            int r = (int) (Math.random() * (this.nbuneCarte));
	            Collections.swap(paquetuneCarte, j, r);
	        }
	    }
	}


	public int getNbuneCarte() {
		return nbuneCarte;
	}
	
	public String retourner() throws PaquetVide {
	    String retour = this.premiereCarte().toString();
		Collections.rotate(this.paquetuneCarte, -1);
        return retour;
    }
	
	
	public void distribuer() throws PaquetVide {
		if (this.getNbuneCarte() == 0) {
			throw new PaquetVide("Paquet vide");
		}
		Collections.rotate(this.paquetuneCarte, -1);
		nbuneCarte --;
	}
	
	




}

