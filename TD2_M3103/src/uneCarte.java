
public class uneCarte {
	@Override
	public String toString() {
		return "uneCarte [couleur=" + couleur + ", valeur=" + valeur + "]";
	}

	private couleur couleur;
	private valeur valeur;
	

	public uneCarte(couleur couleur, valeur valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}
	
	public couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(couleur couleur) {
		this.couleur = couleur;
	}

	public valeur getValeur() {
		return valeur;
	}

	public void setValeur(valeur valeur) {
		this.valeur = valeur;
	}

	

}
