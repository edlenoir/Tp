import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public abstract class Figure {

 
	private List<Point> points;
	private FabriquePoint p;



	public Figure(FabriquePoint p) throws IllegalArgumentException {
		this.p =  p;
		this.points = new ArrayList<Point>();
	}
	

	
    public List<Point> getPoints() {
    	return this.points;
    }
	
    
	public void ajouterPoint(Point p) {;
		this.points.add(p);
	}
	
	 public Color getCouleur() {
	        return this.p.getCouleur();
	    }
	public abstract void tracer(Graphics g);
	
}
