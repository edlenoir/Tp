import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Figure {
	
	private FabriquePoint p;

    public Rectangle(int x1, int y1, int x2, int y2, FabriquePoint p) {
    	super(p);
    	this.ajouterPoint(p.creerPoint(x1, y1));
    	this.ajouterPoint(p.creerPoint(x2, y2));
    }
    
    private int largeur() {
        return Math.abs(this.getPoints().get(1).getAbscisse() - this.getPoints().get(0).getAbscisse());
    }
    
    private int hauteur() {
        return Math.abs(this.getPoints().get(1).getOrdonnée() - this.getPoints().get(0).getOrdonnée());
    }

    @Override
    public void tracer(Graphics g) {
        g.drawRect(this.getPoints().get(0).getAbscisse(), this.getPoints().get(0).getOrdonnée(), this.largeur(), this.hauteur());
    }

}
