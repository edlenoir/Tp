import java.awt.Color;

public class FabriquePointC implements FabriquePoint {
	
	  private Color Couleur;

	public PointNB creerPoint(int x, int y) {
	        return new PointNB(x,y);
	    }
	    
	    public Color getCouleur() {
	        return this.Couleur;
	    }
	    
	    public FabriquePointC(Color couleur) {
	        this.Couleur = couleur;
	    }

	

}
