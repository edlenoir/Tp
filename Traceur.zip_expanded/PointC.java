import java.awt.Color;

public class PointC extends Point {

	private Color couleur;

	public PointC(int abscisse, int ordonn�e,Color couleur) {
		super(abscisse, ordonn�e);
		 this.couleur = couleur;
	}

	public Color getCouleur() {
		return couleur;
	}

	

}
