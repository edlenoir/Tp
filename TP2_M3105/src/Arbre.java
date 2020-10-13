
public class Arbre extends ObjectGraphique {
	private int hauteur;
	private String couleurTronc;
	private String couleurFeuille;
	
	
	public Arbre(int hauteur, String couleurTronc, String couleurFeuille,double coordX,double coordY) {
		super(coordX,coordY);
		this.hauteur = hauteur;
		this.couleurTronc = couleurTronc;
		this.couleurFeuille = couleurFeuille;
	}
	@Override
	public String toString() {
		return "Arbre [hauteur=" + hauteur + ", couleurTronc=" + couleurTronc + ", couleurFeuille=" + couleurFeuille
				+ "]";
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public void setCouleurTronc(String couleurTronc) {
		this.couleurTronc = couleurTronc;
	}
	public void setCouleurFeuille(String couleurFeuille) {
		this.couleurFeuille = couleurFeuille;
	}
	
	public Arbre clone() {
		Arbre clone = null;
			clone = (Arbre) super.clone();
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
		Arbre other = (Arbre) obj;
		if (couleurFeuille == null) {
			if (other.couleurFeuille != null)
				return false;
		} else if (!couleurFeuille.equals(other.couleurFeuille))
			return false;
		if (couleurTronc == null) {
			if (other.couleurTronc != null)
				return false;
		} else if (!couleurTronc.equals(other.couleurTronc))
			return false;
		if (hauteur != other.hauteur)
			return false;
		return true;
	}

}
