
public class Immeuble extends ObjectGraphique implements Cloneable {
	private  String couleur;
	private int nbEtages;
	private int hauteurEtage;
	

	public Immeuble(double coordX, double coordY, String couleur, int nbEtages, int hauteurEtage) {
		super(coordX, coordY);
		this.couleur = couleur;
		this.nbEtages = nbEtages;
		this.hauteurEtage = hauteurEtage;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public void setNbEtages(int nbEtages) {
		this.nbEtages = nbEtages;
	}
	
	public void setHauteurEtage(int hauteurEtage) {
		this.hauteurEtage = hauteurEtage;
	}
	
	@Override
	public String toString() {
		return "Immeuble [couleur=" + couleur + ", nbEtages=" + nbEtages + ", hauteurEtage=" + hauteurEtage + "]";

}
	public Immeuble clone() {
		Immeuble clone = null;
			clone = (Immeuble) super.clone();
			return clone;
		}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Immeuble other = (Immeuble) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (hauteurEtage != other.hauteurEtage)
			return false;
		if (nbEtages != other.nbEtages)
			return false;
		return true;
	}
}
