import java.awt.Color;

public interface FabriquePoint {
    
    public abstract Point creerPoint(int x, int y);

    public abstract Color getCouleur();
    
}