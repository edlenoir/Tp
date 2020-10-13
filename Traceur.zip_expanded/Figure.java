import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
	
    private List<Point> points;
	
	private Color couleur;
	
	public Figure (Color couleur) {
		this.couleur= couleur;
		this.points = new ArrayList<Point>();
	}

	
    public List<Point> getPoints() {
    	return this.points;
    }
    
	public Color getCouleur() {
		return this.couleur;
	}
    
	public void ajouterPoint(Point p) {;
		this.points.add(p);
	}
	
	public abstract void tracer(Graphics g);
	
}
