import java.awt.Color;

public class FabriquePointNB implements FabriquePoint {

    public PointNB creerPoint(int x, int y) {
        return new PointNB(x,y);
    }
    
    public Color getCouleur() {
        return Color.BLACK;
    }



}