import java.awt.Color;

public class FabriquePointC implements FabriquePoint {
    
    private Color couleur;
    
    public FabriquePointC(Color couleur) {
        this.couleur = couleur;
    }

    public Point creerPoint(int x, int y) {
        return new PointC(x,y,this.getCouleur());
    }

    public Color getCouleur() {
        return this.couleur;
    }
    
}