import java.awt.Color;

public class PointC extends Point {

	private Color couleur;

	public PointC(int abscisse, int ordonnée,Color couleur) {
		super(abscisse, ordonnée);
		 this.couleur = couleur;
	}

	public Color getCouleur() {
		return couleur;
	}

	

}
