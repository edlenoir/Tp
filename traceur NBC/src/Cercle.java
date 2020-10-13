import java.awt.Color;
import java.awt.Graphics;

public class Cercle extends Figure {
	
	private FabriquePoint p;

    public Cercle(int x1, int y1, int x2, int y2,FabriquePoint p) {
    	super(p);
    	this.ajouterPoint(p.creerPoint(x1, y1));
    	this.ajouterPoint(p.creerPoint(x2, y2));
    }
    
    
    private double rayon() {
        return Point.distance(this.getPoints().get(0), this.getPoints().get(1));
    }

    @Override
    public void tracer(Graphics g) {
        g.drawOval((int) (this.getPoints().get(0).getAbscisse() - this.rayon()),
        		(int) (this.getPoints().get(0).getOrdonnée() - this.rayon()),
        		(int) (this.rayon() * 2), (int) (this.rayon() * 2));
    }

}
