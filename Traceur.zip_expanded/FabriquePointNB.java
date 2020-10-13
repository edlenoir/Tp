import java.awt.Color;

public class FabriquePointNB implements FabriquePoint {
    
    

    public Point creerPoint(int x, int y) {
        return new PointNB(x,y);
        
    }

    @Override
    public Color getCouleur() {
        return Color.BLACK;
    }

}